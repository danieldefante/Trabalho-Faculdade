/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author daniel
 */
@SuppressWarnings("unchecked")
public abstract class GenericDAO<T> {
       
    public abstract void insert(T entity);
    
    public abstract void update(T entity);
}
