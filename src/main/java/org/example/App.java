package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App
{
    public static void main( String[] args )
    {

        //create configuration
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        configuration.addAnnotatedClass(Song.class);

        //create session factory
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        //initialize the session object
        Session session = sessionFactory.openSession();


        Song song1 = new Song();
//        song1.setId(2);
        song1.setSongName("In the end");
        song1.setSinger("Linkin Park");

        session.beginTransaction();
        session.save(song1); //deprecated !
        session.getTransaction().commit();

        System.out.println("The song was saved .. check the DB ..");

        session.close();

        Session session1 = sessionFactory.openSession();
        session1.beginTransaction();
        session1.save(new Song("I'm bad", "Michael Jackson")); //deprecated !
        session1.getTransaction().commit();

        System.out.println("The next song was saved .. check the DB ..");

        session1.close();
    }
}
