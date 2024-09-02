package org.khnure.lect15.ex2hibernate.crud;
// Import the necessary classes
import org.khnure.lect15.ex2hibernate.model.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class RetrievingEntity {
    public static void main(String[] args) {
//        / Create the configuration object
        Configuration configuration = new Configuration();

// Configure the database connection
        configuration.configure("hibernate.cfg.xml");

// Build the SessionFactory
        SessionFactory sessionFactory = configuration.buildSessionFactory();

// Open a new Session
        Session session = sessionFactory.openSession();

// Get the Person object by its id
        Person person = session.get(Person.class, 1L);

// Print the Person object
        System.out.println(person.getName() + " - " + person.getAge());

// Close the Session
        session.close();
    }
}
