/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daniel.lucas.gerenciamentoeventos.controller;

import daniel.lucas.gerenciamentoeventos.entities.Pessoas;
import daniel.lucas.gerenciamentoeventos.validador.Validador;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author daniel
 */
public class ControllerPessoas implements ControllerGeneric<Pessoas> {

    public Pessoas pessoas = new Pessoas();
    
    public Validador validador = new Validador();
    
    @Override
    public void insert() {
        
        System.out.print("inserir");
        
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

    @Override
    public List<String> validar() {
        
        List<String> camposObrigatorios = new ArrayList();
        camposObrigatorios.add("Nome");
        camposObrigatorios.add("Sobrenome");
        camposObrigatorios.add("CPF/CNPJ");
        
        return validador.validarCamposNulls(camposObrigatorios, pessoas.getNome(),  pessoas.getSobrenome(), pessoas.getCpfCnpj());
    }

    
}
