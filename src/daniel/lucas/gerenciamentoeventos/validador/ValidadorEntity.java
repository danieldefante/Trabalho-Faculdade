/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daniel.lucas.gerenciamentoeventos.validador;

/**
 *
 * @author daniel
 */
public interface ValidadorEntity<T> {
    
    public T camposObrigatorios(T entidade);
}
