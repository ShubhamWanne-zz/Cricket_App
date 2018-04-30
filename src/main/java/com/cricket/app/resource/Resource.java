package com.cricket.app.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.cricket.app.beans.Match;
import com.cricket.app.dbservice.DBResourceUtil;
import com.cricket.app.dbservice.DBService;

@Path("test")
public class Resource {
	
//	@GET
//	@Produces(MediaType.TEXT_PLAIN)
//	public String test() {
//		return "hello";
//	}
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Match> getMatchDetails() {
		/*DBService dbservice = new DBService();
		dbservice.startSessionFactory();
		dbservice.startSession();
		Session session = dbservice.getSession();
		session.beginTransaction();
		
		DBResourceUtil dbUtil = new DBResourceUtil();
		List<Match> match = dbUtil.getData(1, session);
		
		session.getTransaction().commit();*/

		DBService dbservice = new DBService();
    	dbservice.startSessionFactory();
    	SessionFactory sessionFactory = dbservice.getSessionFactory();
    	Session session = null;
    	List<Match> matchTeamList = null;
    	try{
	    	session = sessionFactory.openSession();
	    	session.beginTransaction();
	    	DBResourceUtil dbResourceUtil = new DBResourceUtil();
	    	int team_id = 1,opponent_team_id=3;
	    	matchTeamList = dbResourceUtil.getData(team_id,session);
	    	
	    	for(Match m : matchTeamList)
	    		System.out.println(m);
	    	
	    	session.getTransaction().commit();
	    	return matchTeamList;
    	}catch(Exception e){
    		e.printStackTrace();
    		if(session!=null){
    			session.getTransaction().rollback();
    		}
    	}finally {
			dbservice.closeSessionFactory();
		}
		return null;
	}
}
