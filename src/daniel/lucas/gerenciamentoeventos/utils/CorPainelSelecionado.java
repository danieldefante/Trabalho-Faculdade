/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daniel.lucas.gerenciamentoeventos.utils;

import java.awt.Color;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JTabbedPane;

/**
 *
 * @author daniel
 */
public interface CorPainelSelecionado {
    
    public void panelColorSeleciodado(JTabbedPane jTabbedPanel);
    
    public void setarIcones(JButton jButton, Icon icon ) ;
    
    public void confirmacaoCancelar(String msg) ;
    
}
