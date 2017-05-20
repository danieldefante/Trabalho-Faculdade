/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daniel.lucas.gerenciamentoeventos.validador;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author daniel
 */
public class Validador {

    private List<String> retorno = new ArrayList();
    private int i = 0;
    
    public List<String> validarCamposNulls(List<String> nomeCampos, Object... campos){

        List<Object> lista = Arrays.asList(campos);

        lista.forEach(campo -> {
 
            if(campo == null){
                retorno.add(nomeCampos.get(i));
            }
            i++;
        });
        
        return retorno;
    } 
    
}
