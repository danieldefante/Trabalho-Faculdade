/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daniel.lucas.gerenciamentoeventos.controller;

import daniel.lucas.gerenciamentoeventos.entities.Enderecos;
import daniel.lucas.gerenciamentoeventos.entities.Pessoas;
import java.util.List;
import static daniel.lucas.gerenciamentoeventos.validador.ValidadorPessoa.validar;

/**
 *
 * @author daniel
 */
public class ControllerPessoas implements Controller<Pessoas> {

    public Pessoas pessoas;

    public ControllerPessoas() {
        this.pessoas = new Pessoas();
    }
    
    @Override
    public String insert() {
        
        return validar(pessoas);
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
