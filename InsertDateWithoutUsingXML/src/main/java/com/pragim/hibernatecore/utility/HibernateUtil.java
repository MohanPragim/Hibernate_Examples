package com.pragim.hibernatecore.utility;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.pragim.hibernatecore.mobel.Person;

public class HibernateUtil {

	private static SessionFactory sessionFactory = null;

	public static SessionFactory getSessionFactory() {

		if (sessionFactory == null) {

			try {
				Configuration configuration = new Configuration();
				// Hibernate settings equivalent to hibernate.cfg.xml's properties
				Properties props = new Properties();
				props.put(Environment.DRIVER, "com.mysql.jdbc.Driver");
				props.put(Environment.URL, "jdbc:mysql://localhost:3306/localdb");
				props.put(Environment.USER, "root");
				props.put(Environment.PASS, "");
				props.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
				props.put(Environment.SHOW_SQL, "true");
				props.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
				props.put(Environment.HBM2DDL_AUTO, "update");
				configuration.setProperties(props);
				configuration.addAnnotatedClass(Person.class);
				ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
						.applySettings(configuration.getProperties()).build();
				sessionFactory = configuration.buildSessionFactory(serviceRegistry);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return sessionFactory;
	}
}
