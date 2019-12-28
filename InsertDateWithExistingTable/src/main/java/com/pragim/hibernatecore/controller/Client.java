package com.pragim.hibernatecore.controller;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.pragim.hibernatecore.entity.Person;

public class Client {

	public static void main(String[] args) {

		Session session = new Configuration().configure().buildSessionFactory().openSession();

		Person person = new Person();
		person.setpName("Sai");
		person.setAdrr("Visakha");

		Transaction tx = session.beginTransaction();
		session.save(person);
		tx.commit();

	}
}
