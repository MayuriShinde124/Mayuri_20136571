package com;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {

	public static void main(String[] args) {
		 Configuration cfg = new Configuration();
	        cfg.configure("hibernate.cfg.xml");

	        SessionFactory factory = cfg.buildSessionFactory();
	        Session session = factory.openSession();

	        Transaction tx = session.beginTransaction();

			EmployeeIGT e=new EmployeeIGT();
			
		
	        Scanner sc=new Scanner(System.in);
	        System.out.println("enter id : ");
	        int cid=sc.nextInt();
	        
	        System.out.println("enter name : ");
	        String cname=sc.next();
	        
	        System.out.println("enter place: ");
	        String place=sc.next();
	        
	        System.out.println("enter pan : ");
	        String pan=sc.next();
	        
	        
	        e.setCid(cid);
	        e.setCname(cname);
	        e.setPlace(place);
	        e.setPan(pan);
	        
	        session.save(e);
	        tx.commit();
	        System.out.println("value inserted...!");

	}

}
