/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daniel.lucas.gerenciamentoeventos.validador;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Id;

/**
 *
 * @author daniel
 */
public class Validador<T>{

    private final Class<T> clazz;
    private static List<String> retorno = new ArrayList();
    private static int i;
    private static List<String> camposObrigatorios;
    
    public Validador(Class<T> clazz) {
        this.clazz = clazz;
        this.camposObrigatorios = new ArrayList(); 
        
    }

    
    public static List<String> validarCamposNulls(List<String> nomeCampos, Object... campos){

        List<Object> lista = Arrays.asList(campos);

        lista.forEach(campo -> {
 
            if(campo == null){
                retorno.add(nomeCampos.get(i));
            }
            i++;
        });
        
        return retorno;
    } 
    
    public List<String> validarEntity(T entity){
 
        List<String> listaAtributos = new ArrayList();
//        List<Class> listaAtributosTypes = new ArrayList();
        
        Method[] methods = clazz.getMethods();
        
        List <Object> obj = new ArrayList();
       
        //percorre classe e tras campos obrigatorios
        for (Method m : methods){
            if (m.isAnnotationPresent(Column.class) && !m.isAnnotationPresent(Id.class)){
                try {
                    
                    Column ta = m.getAnnotation(Column.class);
                    listaAtributos.add(ta.name());
                    obj.add( m.invoke(entity) );
//                    listaAtributosTypes.add(m.getReturnType());
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }

        //valida campos nulls
        i = 0;
        obj.forEach(a->{
            
            String mascara = ((String) a).replace("(", "").replace(")", "").replace(" ", "").replace("-", "");
            
            if(a == null || mascara.equals("")){
                camposObrigatorios.add(listaAtributos.get(i));
//            }else{
//               System.out.println(a.getClass() +" = "+ listaAtributosTypes.get(i));
            }
            i++;
        });
        
        return camposObrigatorios;
    }
    
}
