package com.yashasvi;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

//		Configuration cfg = new Configuration();
//		cfg.configure(); /* this reads hibernate.cfg.xml */
//
//		SessionFactory factory = cfg.buildSessionFactory();
//		
//        System.out.print(factory);
		
		SessionFactory factory = HibernateUtil.getSessionFactory();
		System.out.print(factory);
	}
}
