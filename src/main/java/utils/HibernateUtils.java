package utils;

import entity.Song;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
    private static SessionFactory sessionFactory = null;
    public static SessionFactory getSessionFactory(){

        try{
            if (sessionFactory == null) {

                //create configuration
                Configuration configuration = new Configuration();
                // configuration.configure("hibernate.cfg.xml");
                // if setting file named by default == hibernate.cfg.xml - it can be omitted
                configuration.configure();
                configuration.addAnnotatedClass(Song.class);

                //create session factory
                sessionFactory = configuration.buildSessionFactory();
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Session Factory object not created because of some issue");
        }
        return sessionFactory;
    }
}
