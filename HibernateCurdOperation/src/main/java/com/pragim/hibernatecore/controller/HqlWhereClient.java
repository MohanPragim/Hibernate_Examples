package com.pragim.hibernatecore.controller;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.pragim.hibernatecore.utility.HibernateUtil;

public class HqlWhereClient {

	public static void main(String[] args) {
		
         SessionFactory factory = HibernateUtil.getSessionFactory();
         Session session = factory.openSession();
         Scanner scan = new Scanner(System.in);
         System.out.println("Enter the name");
         String name = scan.next();
         Query query = session.createQuery("from Orders where foodName like :char");
         query.setParameter(1, name);
         
         
         
	}
}
