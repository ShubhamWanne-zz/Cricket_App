package com.cricket.app;

import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.cricket.app.beans.PlayerMatch;
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
	    	int team_id = 1,opponent_team_id=3;
	    	List<MatchTeam> matchTeamList = dbResourceUtil.getData(team_id,opponent_team_id,session);
	    	
	    	for(MatchTeam m :  matchTeamList){
	    		logger.info(m);
	    	}
	    	int matchID = 335987;
	    	List<PlayerMatch> playerMatchList = dbResourceUtil.getMatchData(matchID, session);
	    	for(PlayerMatch m : playerMatchList)
	    		logger.info(m);
	    	
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
