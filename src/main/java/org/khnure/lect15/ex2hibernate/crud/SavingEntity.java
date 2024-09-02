package org.khnure.lect15.ex2hibernate.crud;

// Import the necessary classes
import org.khnure.lect15.ex2hibernate.model.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SavingEntity {

    public static void main(String[] args) {

        // Create the configuration object
        Configuration configuration = new Configuration();

// Configure the database connection
        configuration.configure("hibernate.cfg.xml");

// Build the SessionFactory
        SessionFactory sessionFactory = configuration.buildSessionFactory();

// Open a new Session
        Session session = sessionFactory.openSession();

// Create a new Person object
        Person person = new Person();
        person.setName("John Doe");
        person.setAge(30);

// Save the Person object
        session.save(person);

// Commit the transaction
        session.getTransaction().commit();

// Close the Session
        session.close();
    }
}
