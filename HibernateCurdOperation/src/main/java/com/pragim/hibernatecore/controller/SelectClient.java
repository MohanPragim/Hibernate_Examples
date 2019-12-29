package com.pragim.hibernatecore.controller;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.pragim.hibernatecore.model.Orders;
import com.pragim.hibernatecore.utility.HibernateUtil;

public class SelectClient {

	public static void main(String[] args) {

		// To get the full data using query interface
		/*
		 * SessionFactory factory = HibernateUtil.getSessionFactory(); Session session =
		 * factory.openSession(); Query query = session.createQuery("from Orders");
		 * List<Orders> list = query.list(); for (Orders orders : list) {
		 * System.out.println(orders); }
		 */

		// getPartialData();
		getOneRecord();
	}
	
	// To get partial data using query interface

	public static void getPartialData() {

		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Query query = session.createQuery("select o.orderId, o.noOfItems, o.foodName from Orders o");
		List<Object[]> list = query.list();
		for (Object[] object : list) {
			for (Object objects : object) {
				System.out.print(objects+" ");
			}
			
			System.out.println();
		}
	}
	
	// To get one column data using query interface
	
	public static void getOneRecord() {
		
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Query query = session.createQuery("select o.restaurantName from Orders o");
		List<Object> list = query.list();
		for(Object object: list)
			System.out.println(object);
		
	}
}
