/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daniel.lucas.gerenciamentoeventos.utils;


import static daniel.lucas.gerenciamentoeventos.utils.HibernateUtil.getSessionFactory;
import java.util.Arrays;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


/**
 *
 * @author daniel
 */
public class FactoryGeneric <T> {

    
    public String insertDB(T... entitys) {
        
        SessionFactory sessionFactory = getSessionFactory();
        Session session = sessionFactory.openSession();
        try {
            
            Transaction transaction = session.beginTransaction();

            for(T entity : entitys){
                
                session.save(entity);
            }
      
            transaction.commit();
            return "success";
        } catch (Exception e) {
            
            if(session.getTransaction() != null){
                session.getTransaction().rollback();
                System.out.println(e.getMessage());
            }
            return "error";
        }finally{
            session.clear();
            session.close();
        }
    }
    
}
