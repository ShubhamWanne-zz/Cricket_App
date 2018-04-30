package com.cricket.app.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.cricket.app.beans.Match;
import com.cricket.app.dbservice.DBResourceUtil;
import com.cricket.app.dbservice.DBService;

@Path("/teams")
public class Resource {
	private static DBService dbservice;
	private static SessionFactory sessionFactory;
	static {
		dbservice = new DBService();
		dbservice.startSessionFactory();
		sessionFactory = dbservice.getSessionFactory();
	}
		
	
	@GET
	@Path("/query")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Match> getTeamStats(@Context UriInfo info) {
		String teamId = info.getQueryParameters().getFirst("teamId");
		String opponentId = info.getQueryParameters().getFirst("opponentId");
    	Session session = null;
    	List<Match> matchTeamList = null;
    	try{
	    	session = sessionFactory.openSession();
	    	session.beginTransaction();
	    	DBResourceUtil dbResourceUtil = new DBResourceUtil();
	    	if(opponentId == null)
	    		matchTeamList = dbResourceUtil.getTeamStats(Integer.parseInt(teamId),session);
	    	else
	    		matchTeamList = dbResourceUtil.getTeamComparisonStats(Integer.parseInt(teamId), Integer.parseInt(opponentId), session);
	    	
	    	return matchTeamList;
    	}catch(Exception e){
    		e.printStackTrace();
    		if(session!=null){
    			session.getTransaction().rollback();
    		}
    	}
		return matchTeamList;
	}
	
}
