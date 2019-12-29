package com.pragim.hibernatecore.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.pragim.hibernatecore.mobel.Person;
import com.pragim.hibernatecore.utility.HibernateUtil;

public class Client {

	public static void main(String[] args) {

		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Person person = new Person();
		person.setPname("Tomi");
		person.setAdrr("Delhi");
		Transaction tx = session.beginTransaction();
		session.save(person);
		tx.commit();
	}
}
