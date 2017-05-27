/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daniel.lucas.gerenciamentoeventos.utils;

import daniel.lucas.gerenciamentoeventos.entities.Pessoas;
import static daniel.lucas.gerenciamentoeventos.validador.Validador.validarCamposNulls;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author daniel
 */
public class ValidadorPessoa {

    /**
     *
     * @param pessoas
     * @return
     */
    public static String validarEntidade(Pessoas pessoas){
        List<String> a = new ArrayList();

        List<String> validarCamposNulls = validarCamposNulls(a, pessoas.getNome());
        
        if(validarCamposNulls.size() > 0){
            
            StringBuilder sb = new StringBuilder();
            validarCamposNulls.forEach( campo -> {
                sb.append(campo);
            });
            
            return sb.toString();
        }else{
            return new FactoryGeneric<>().insert(pessoas);
        }
        
    }
}
