package com.cricket.app.dbservice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DBService {
	private SessionFactory sessionFactory;
	private Session session;
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
	}
	
	public void startSession() {
		sessionFactory.openSession();
	}
	
	public Session getSession() {
		return session;
	}
	
	public void closeSession() {
		session.close();
	}
}
