package com.hibarnatedemo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(sınıf.class).buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			session.beginTransaction();
			
			List<sınıf> classes= session.createQuery("from sınıf").getResultList();
			
			for(sınıf s:classes) {
				System.out.println(s.getName());
			}
			
			session.beginTransaction().commit();
		}
		finally {
			factory.close();
		}
		
		
	}

}
