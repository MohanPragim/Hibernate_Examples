package com.pragim.firstappusinghibernate.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.pragim.firstappusinghibernate.entity.Person;

public class Client {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		Person person = new Person();
		person.setName("Mohan");
		person.setAdrr("Bangalore");
		Transaction tx = session.beginTransaction();
		session.save(person);
		tx.commit();

	}
}
