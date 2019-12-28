package com.pragim.hibernatecore.controller;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.pragim.hibernatecore.entity.Student;

public class Client {

	public static void main(String[] args) {

		Session session = new Configuration().configure().buildSessionFactory().openSession();

		Student student = new Student();
		student.setSname("Sai");
		student.setDept("EEE");
		Transaction tx = session.beginTransaction();
		session.save(student);
		tx.commit();

	}
}
