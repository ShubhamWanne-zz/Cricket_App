package com.cricket.app.dbservice;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DBService {
	private SessionFactory sessionFactory;
	public void startSessionFactory(){
		try{
			sessionFactory = new Configuration().configure().buildSessionFactory();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	public void closeSessionFactory(){
		if(sessionFactory!=null){
			sessionFactory.close();
		}
		System.exit(0);
	}
	
}
