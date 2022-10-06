package hibernate;

import entity.Song;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import utils.HibernateUtils;

public class DeleteApp {

    public static void main(String[] args) {

        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();

        Session session = sessionFactory.openSession();

        Song song = session.get(Song.class, 4);

        session.beginTransaction();
        session.delete(song);
        session.getTransaction().commit();

    }
}
