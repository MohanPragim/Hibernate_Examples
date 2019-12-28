package com.pragim.hibernatecoreannotation.entity;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Client {

	public static void main(String[] args) {

		Session session = new Configuration().configure().buildSessionFactory().openSession();

		Student student = new Student();
		student.setSname("Siva");
		student.setDept("ITI");
		Transaction tx = session.beginTransaction();
		session.save(student);
		tx.commit();
	}
}
