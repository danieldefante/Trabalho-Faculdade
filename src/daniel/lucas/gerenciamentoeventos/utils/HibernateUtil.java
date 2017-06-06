package daniel.lucas.gerenciamentoeventos.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author odair
 */
public class HibernateUtil {

    private static final SessionFactory sessionFactory;
    private static Session session;

    static {
        try {

            Configuration configuration = new Configuration().configure();
            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                    .applySettings(configuration.getProperties()).build();
            // builds a session factory from the service registry
            sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        } catch (Throwable ex) {
            // Log the exception. 
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }


    
//    public static void openSessionTransaction() {
//        session = getSessionFactory().openSession();
//        session.beginTransaction();
//    }
//
//    public static void closeSessionTransaction() {
//        try {
//            session.getTransaction().commit();
//        } catch (RuntimeException e) {
//            if (session.getTransaction() != null) {
//                session.getTransaction().rollback();
//            }
//            e.printStackTrace();
//        } finally {
//            session.flush();
//            session.close();
//        }
//    }
//
//    public static Session getSessionTransaction() {
//        return session;
//    }
}
