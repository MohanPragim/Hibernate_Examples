package com.pragim.hibernatecore.controller;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.pragim.hibernatecore.model.Food;

public class Client {

	public static void main(String[] args) {

		Session session = new Configuration().configure().buildSessionFactory().openSession();
		Food food = new Food();
		food.setFoodName("Paneercurry");
		food.setRestaurant("Jaffas");
		food.setFoodItems(10);
		Transaction tx = session.beginTransaction();
		session.save(food);
		tx.commit();

	}
}
