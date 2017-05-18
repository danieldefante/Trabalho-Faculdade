/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author daniel
 */
public class FactoryGeneric<T> {

    
    public void insert(T entity) {
        
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        
        
        Session session = sessionFactory.openSession();
       
        Transaction transaction = session.beginTransaction();
        
        session.save(entity);
    
        transaction.commit();
        session.flush();
        session.clear();
    }
    
}
