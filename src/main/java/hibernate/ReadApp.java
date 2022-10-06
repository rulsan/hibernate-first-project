package hibernate;

import entity.Song;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ReadApp {

    public static void main(String[] args) {

        Configuration configuration = new Configuration();
        configuration.configure();
        configuration.addAnnotatedClass(Song.class);

        SessionFactory sessionFactory = configuration.buildSessionFactory();

        Session session = sessionFactory.openSession();

//        Song song = session.get(Song.class, 2);
        Song song = session.load(Song.class, 2);

        System.out.println(song);
    }
}
