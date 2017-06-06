/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daniel.lucas.gerenciamentoeventos.utils;

import javax.swing.JOptionPane;

/**
 *
 * @author daniel
 */
public class Messagens {
    

    
    public static void error(String msg){
        JOptionPane.showMessageDialog(null, msg);
    }
    
    public static void success(String msg){
        JOptionPane.showMessageDialog(null, msg);
    }
    
    public static void camposObrigatorios(String msg){
        JOptionPane.showMessageDialog(null, msg);
    }
 
}
