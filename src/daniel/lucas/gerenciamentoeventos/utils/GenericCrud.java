/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daniel.lucas.gerenciamentoeventos.utils;

/**
 *
 * @author daniel
 */
public abstract class GenericCrud<T> {
    
    public abstract boolean insert(T entity);
    
    public abstract boolean update(T entity);
    
    public abstract boolean delete(T entity);
    
    public abstract T find(T entity);
}
