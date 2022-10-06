package hibernate;

import entity.Song;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import utils.HibernateUtils;

public class ReadApp {

    public static void main(String[] args) {

        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();

        Session session = sessionFactory.openSession();

//        Song song = session.get(Song.class, 2);
        Song song = session.load(Song.class, 2);

        System.out.println(song);
    }
}
