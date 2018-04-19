package com.cricket.app;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.cricket.app.beans.Season;
import com.cricket.app.dbservice.DBService;

/**
 * Hello world!
 *
 */
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
	    	Season season = session.get(Season.class, 1);
	    	logger.info(season);
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
