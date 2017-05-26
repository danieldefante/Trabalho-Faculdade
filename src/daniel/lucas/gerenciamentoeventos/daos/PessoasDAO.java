/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daniel.lucas.gerenciamentoeventos.daos;

import daniel.lucas.gerenciamentoeventos.entities.Pessoas;
import daniel.lucas.gerenciamentoeventos.utils.GenericCrud;
import daniel.lucas.gerenciamentoeventos.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author daniel
 */
public class PessoasDAO extends GenericCrud<Pessoas> { 

    public static void metodoStatic(Pessoas p){
       
    }
    
    @Override
    public boolean insert(Pessoas pessoas) {
        
        Session session = HibernateUtil.getSession();
        try {
            session.beginTransaction();
            session.merge(pessoas);
            session.beginTransaction().commit();
        } catch (Exception e) {
            
            if(session.getTransaction() != null){
                session.getTransaction().rollback();
                System.out.println(e.getMessage());
            }
            
        }finally{
            session.clear();
            session.close();
        }

        
        return true;
    }

    @Override
    public boolean update(Pessoas entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Pessoas entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pessoas find(Pessoas entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
