package com.cricket.app;

import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.cricket.app.dbservice.DBResourceUtil;
import com.cricket.app.dbservice.DBService;
import com.cricket.app.statsbeans.MatchTeam;

public class App 
{
	public static Logger logger = Logger.getLogger(App.class);
	static{
		PropertyConfigurator.configure("log4j.properties");
	}
	public static void main( String[] args ){
    	logger.info("************Application Started*****************");
    	DBService dbservice = new DBService();
    	dbservice.startSessionFactory();
    	SessionFactory sessionFactory = dbservice.getSessionFactory();
    	Session session = null;
    	try{
	    	session = sessionFactory.openSession();
	    	session.beginTransaction();
	    	
	    	DBResourceUtil dbResourceUtil = new DBResourceUtil();
	    	List<MatchTeam> matchTeamList = dbResourceUtil.getData(1, session);
	    	for(MatchTeam m :  matchTeamList){
	    		logger.info(m);
	    	}
	    	session.getTransaction().commit();
    	}catch(Exception e){
    		e.printStackTrace();
    		if(session!=null){
    			logger.warn("Rollbacking transaction");
    			session.getTransaction().rollback();
    		}
    	}finally {
			dbservice.closeSessionFactory();
		}
    }
}
