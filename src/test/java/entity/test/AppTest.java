package entity.test;

import static org.junit.Assert.assertSame;

import org.hibernate.SessionFactory;
import org.junit.Test;
import utils.HibernateUtils;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void checkSingleton()
    {

        SessionFactory sessionFactory1 = HibernateUtils.getSessionFactory();

        SessionFactory sessionFactory2 = HibernateUtils.getSessionFactory();

        System.out.println(sessionFactory1 + " - " + sessionFactory2);

        assertSame( "sessionFactory1 and sessionFactory2 do not refer to same object:", sessionFactory1, sessionFactory2 );
    }
}
