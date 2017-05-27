/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daniel.lucas.gerenciamentoeventos.validador;

import daniel.lucas.gerenciamentoeventos.entities.Pessoas;
import daniel.lucas.gerenciamentoeventos.utils.FactoryGeneric;
import static daniel.lucas.gerenciamentoeventos.validador.Validador.validarCamposNulls;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author daniel
 */
public class ValidadorPessoa {

    public static String validar(Pessoas pessoas){

        List<String> validarCamposNulls = popularCamposObrigatorios(popularNomeCamposObrigatorios(), pessoas);
        
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
    
    private static List<String> popularNomeCamposObrigatorios() {
        return new ArrayList<String>(Arrays.asList (new String[]{
                                                    "Nome",
                                                    "Sobrenome",
                                                    "CPF/CNPJ",
                                                    "RG",
                                                    "Contato",
                                                    "Endereco"
                                                }));
    }

    private static List<String> popularCamposObrigatorios(List<String> lista, Pessoas pessoas) {
        return validarCamposNulls(lista, pessoas.getNome(),
                                         pessoas.getSobrenome(),
                                         pessoas.getCpfCnpj(),
                                         pessoas.getRg(),
                                         pessoas.getContatos(),
                                         pessoas.getEnderecos());
    }
}
