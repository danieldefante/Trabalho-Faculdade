/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daniel.lucas.gerenciamentoeventos.controller;

import daniel.lucas.gerenciamentoeventos.entities.Contatos;
import daniel.lucas.gerenciamentoeventos.entities.Enderecos;
import daniel.lucas.gerenciamentoeventos.entities.Pessoas;
import daniel.lucas.gerenciamentoeventos.utils.FactoryGeneric;
import java.util.List;

/**
 *
 * @author daniel
 */
public class ControllerPessoas implements Controller<Pessoas> {

    public Pessoas pessoas;
    
    public Enderecos enderecos;
    
    public Contatos contatos;

    public ControllerPessoas() {
        this.pessoas = new Pessoas();
        this.enderecos = new Enderecos();
        this.contatos = new Contatos();
    }
    
    @Override
    public String insert() {
        
        FactoryGeneric factoryGeneric = new FactoryGeneric();
        
        pessoas.setContatos(contatos);
        pessoas.setEnderecos(enderecos);
        
        return factoryGeneric.insertDB(contatos, enderecos, pessoas);
    }

    @Override
    public Pessoas update() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pessoas delete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pessoas find() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Pessoas> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
