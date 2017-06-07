/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daniel.lucas.gerenciamentoeventos.repository;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import daniel.lucas.gerenciamentoeventos.entities.Atracoes;
import daniel.lucas.gerenciamentoeventos.utils.HibernateUtil;

public class AtracoesRepository implements RepositoryAwareInterface<Atracoes>{

    @Override
    public List<Atracoes> findAll() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("SELECT a FROM Atracoes a");
        return query.list();
    }

    @Override
    public Atracoes findById() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
