/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daniel.lucas.gerenciamentoeventos.controller;

import daniel.lucas.gerenciamentoeventos.entities.Contatos;
import java.util.List;

/**
 *
 * @author daniel
 */
public class ControllerContatos implements Controller<Contatos>{

    public Contatos contatos;
    
    public ControllerContatos() {
        this.contatos = new Contatos();
    }
    
    @Override
    public String insert() {
        return null;//validar(contatos);
    }

    @Override
    public Contatos update() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Contatos delete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Contatos find() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Contatos> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
