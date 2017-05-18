/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classprincipal;

import controller.ControllerEndereco;
import entities.Enderecos;
import forms.JanelaPrincipal;

/**
 *
 * @author aluno
 */
public class TrabalhoGerenciamentoEventos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        JanelaPrincipal janelaPrincipal = new JanelaPrincipal();
        janelaPrincipal.setVisible(true);
//        teste();
    }

    private static void teste() {
    ControllerEndereco controllerEndereco = new ControllerEndereco();
    
        Enderecos enderecos = new Enderecos();
    
        enderecos.setBairro("Periolo");
        enderecos.setCep("85806-756");
        enderecos.setCidade("Cascavel");
        enderecos.setId(4);
        enderecos.setNumero("78");
        enderecos.setRua("Alto Brusque");
        enderecos.setUf("PR");
    
    controllerEndereco.insert(enderecos);
    
    }


    
}
