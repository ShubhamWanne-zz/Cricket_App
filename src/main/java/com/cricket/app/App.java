package com.cricket.app;

import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.cricket.app.beans.Match;
import com.cricket.app.dbservice.DBService;

public class App 
{
	public static Logger logger = Logger.getLogger(App.class);
	static{
		PropertyConfigurator.configure("log4j.properties");
	}
	@SuppressWarnings("unchecked")
    public static void main( String[] args ){
    	logger.info("************Application Started*****************");
    	DBService dbservice = new DBService();
    	dbservice.startSessionFactory();
    	SessionFactory sessionFactory = dbservice.getSessionFactory();
    	Session session = null;
    	try{
	    	session = sessionFactory.openSession();
	    	session.beginTransaction();
//			Query<Match> query = session.getNamedQuery("RecordsByTeamID");
			Query<Match> query = session.getNamedQuery("RecordsByMatchID");
	    	query.setParameter("matchID", 335991);
	    	List<Match> result = query.list();
	    	for(Match m : (List<Match>)result){
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
