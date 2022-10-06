package hibernate;

import entity.Song;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UpdateApp {

    public static void main(String[] args) {

        Configuration configuration = new Configuration();
        configuration.configure();
        configuration.addAnnotatedClass(Song.class);

        SessionFactory sessionFactory = configuration.buildSessionFactory();

        Session session = sessionFactory.openSession();

        Song song = session.get(Song.class, 1);
        song.setSongName("RIM ZHIM GIRE SAWAN");

        session.beginTransaction();
        session.update(song);
        session.getTransaction().commit();

    }
}
