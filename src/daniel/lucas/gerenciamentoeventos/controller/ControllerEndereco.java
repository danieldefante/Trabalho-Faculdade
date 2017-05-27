/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daniel.lucas.gerenciamentoeventos.controller;

import daniel.lucas.gerenciamentoeventos.entities.Enderecos;
import static daniel.lucas.gerenciamentoeventos.validador.ValidadorEndereco.validar;
import java.util.List;

/**
 *
 * @author daniel
 */
public class ControllerEndereco implements Controller<Enderecos>{

    public Enderecos enderecos;
    
    @Override
    public String insert() {
        return validar(enderecos);
    }

    @Override
    public Enderecos update() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Enderecos delete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Enderecos find() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Enderecos> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
