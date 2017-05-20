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
public interface TratamentoFields {
    
        
    public int popularControllerInteger(String a, String campo);
    
    public double popularControllerFloat(String a, String campo);
    
    public String popularControllerString(String a, String campo) throws Exception;
    
}
