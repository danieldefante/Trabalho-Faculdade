/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daniel.lucas.gerenciamentoeventos.controller;

import daniel.lucas.gerenciamentoeventos.validador.Validador;
import java.util.List;

/**
 *
 * @author daniel
 */
public interface Controller<T> { 
    
    public String insert();

    public T update();

    public T delete();

    public T find();
    
    public List<T> findAll();
}
