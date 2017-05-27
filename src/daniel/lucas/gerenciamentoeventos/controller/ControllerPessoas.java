/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daniel.lucas.gerenciamentoeventos.controller;

import daniel.lucas.gerenciamentoeventos.entities.Enderecos;
import daniel.lucas.gerenciamentoeventos.entities.Pessoas;
import static daniel.lucas.gerenciamentoeventos.utils.ValidadorPessoa.validarEntidade;
import java.util.List;

/**
 *
 * @author daniel
 */
public class ControllerPessoas implements Controller<Pessoas> {

    public Pessoas pessoas;// = new Pessoas();
    public Enderecos enderecos;// = new Enderecos();

    public ControllerPessoas() {
        
        this.pessoas = new Pessoas();
        this.enderecos = new Enderecos();
    }
    
    @Override
    public String insert() {
        
        return validarEntidade(pessoas);
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
