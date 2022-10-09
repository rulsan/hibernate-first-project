package hibernate;

import entity.Song;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import utils.HibernateUtils;

public class UpdateApp {

    public static void main(String[] args) {

        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();

        if(sessionFactory != null) {

            Session session = sessionFactory.openSession();

            Song song = session.get(Song.class, 1);
            song.setSongName("RIM ZHIM GIRE SAWAN - UPDATED");

            session.beginTransaction();
        //  session.update(song); - it can be omitted
            session.getTransaction().commit();
        }
    }
}
