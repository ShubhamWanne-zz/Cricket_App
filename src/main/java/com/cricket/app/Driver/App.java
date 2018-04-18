package com.cricket.app.Driver;
import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.cricket.app.dbservice.DBService;

public class App {

	public static void main(String[] args) {
		DBService dbservice = new DBService();
		dbservice.startSessionFactory();
		SessionFactory factroy = dbservice.getSessionFactory();
		Session session = factroy.openSession();
		
    	Transaction tx = null;
    	
    	try {
    		tx = session.beginTransaction();
    		List seasonList = session.createQuery("SELECT seasonYear FROM Season").list();
    		Iterator it = seasonList.iterator();
    		while(it.hasNext()) {
    			System.out.println(it.next());
    		}
    		tx.commit();
    	} catch(HibernateException ex){
    		if(tx !=null)
    			tx.rollback();
    		ex.printStackTrace();
    	} finally {
    		session.close();
    	}
    	
    	dbservice.closeSessionFactory();
	}

}
