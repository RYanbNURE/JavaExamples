package org.khnure.lect15.ex2hibernate;

// Import the necessary classes
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Conf {
    public static void main(String[] args) {
        // Create the configuration object
        Configuration configuration = new Configuration();

// Configure the database connection
        configuration.configure("hibernate.cfg.xml");

        // Build the SessionFactory
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        // Open a new Session
        Session session = sessionFactory.openSession();
    }
}
