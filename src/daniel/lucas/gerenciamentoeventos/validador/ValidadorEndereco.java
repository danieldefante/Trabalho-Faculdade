/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daniel.lucas.gerenciamentoeventos.validador;

import daniel.lucas.gerenciamentoeventos.entities.Enderecos;
import daniel.lucas.gerenciamentoeventos.utils.FactoryGeneric;
import java.util.ArrayList;
import java.util.List;
import static daniel.lucas.gerenciamentoeventos.validador.Validador.validarCamposNulls;
import java.util.Arrays;
/**
 *
 * @author daniel
 */
public class ValidadorEndereco{
    
    public static String validar(Enderecos enderecos){
        
        List<String> validarCamposNulls = popularCamposObrigatorios(popularNomeCamposObrigatorios(), enderecos);
        
        if(validarCamposNulls.size() > 0){
            
            StringBuilder sb = new StringBuilder();
            validarCamposNulls.forEach( campo -> {
                sb.append(campo);
            });
            
            return sb.toString();
        }else{
            return new FactoryGeneric<>().insert(enderecos);
        }
        
    }
    
    private static List<String> popularNomeCamposObrigatorios() {
        return new ArrayList<String>(Arrays.asList (new String[]{
                                                        "Cep",
                                                        "Rua",
                                                        "Bairro",
                                                        "Cidade",
                                                        "UF",
                                                        "Número"
                                                    }));
    }

    private static List<String> popularCamposObrigatorios(List<String> lista, Enderecos enderecos) {
        return validarCamposNulls(lista, enderecos.getCep(),
                                         enderecos.getRua(),
                                         enderecos.getCidade(),
                                         enderecos.getUf(),
                                         enderecos.getNumero());
    }



}
