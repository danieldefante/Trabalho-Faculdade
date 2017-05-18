/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entities.Enderecos;
import utils.FactoryGeneric;
import utils.GenericDAO;

/**
 *
 * @author daniel
 */
public class ControllerEndereco extends GenericDAO<Enderecos>{

    private FactoryGeneric factory = new FactoryGeneric();
    
    @Override
    public void insert(Enderecos enderecos) {
        
        factory.insert(enderecos);
    }

    @Override
    public void update(Enderecos entity) {
        throw new UnsupportedOperationException("Método não implantado.");
    }
    
    

}
