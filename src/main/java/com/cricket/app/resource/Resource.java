package com.cricket.app.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.cricket.app.beans.Match;
import com.cricket.app.dbservice.DBResourceUtil;
import com.cricket.app.dbservice.DBService;

@Path("test/{teamId}")
public class Resource {
	private static DBService dbservice;
	private static SessionFactory sessionFactory;
	static {
		dbservice = new DBService();
		dbservice.startSessionFactory();
		sessionFactory = dbservice.getSessionFactory();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Match> getMatchDetails(@QueryParam(value = "teamId") int teamId) {
    	Session session = null;
    	List<Match> matchTeamList = null;
    	try{
	    	session = sessionFactory.openSession();
	    	session.beginTransaction();
	    	DBResourceUtil dbResourceUtil = new DBResourceUtil();
	    	matchTeamList = dbResourceUtil.getTeamStats(teamId,session);
    	}catch(Exception e){
    		e.printStackTrace();
    		if(session!=null){
    			session.getTransaction().rollback();
    		}
    	}
		return matchTeamList;
	}
}
