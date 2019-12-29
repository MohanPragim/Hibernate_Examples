package com.pragim.hibernatecore.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.pragim.hibernatecore.model.Orders;
import com.pragim.hibernatecore.utility.HibernateUtil;

public class Client {

	public static void main(String[] args) {

		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Orders orders = new Orders();
		orders.setNoOfItems(4);
		orders.setFoodName("GonguraChicken");
		orders.setOrderId(430l);
		orders.setRestaurantName("Kritunga");
		orders.setPrice(180.0);
		orders.setDiscount(10);
		Transaction tx = session.beginTransaction();
		session.save(orders);
		tx.commit();
	}
}
