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
    
    public abstract void insert(T entity);
    
    public abstract void update(T entity);
    
    public abstract void delete(T entity);
    
    public abstract void find(T entity);
}
