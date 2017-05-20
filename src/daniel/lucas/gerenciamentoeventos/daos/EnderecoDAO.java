/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daniel.lucas.gerenciamentoeventos.daos;

import daniel.lucas.gerenciamentoeventos.entities.Enderecos;
import daniel.lucas.gerenciamentoeventos.utils.FactoryGeneric;
import daniel.lucas.gerenciamentoeventos.utils.GenericCrud;

/**
 *
 * @author daniel
 */
public class EnderecoDAO extends GenericCrud<Enderecos>{

    private FactoryGeneric factory = new FactoryGeneric();

    @Override
    public void insert(Enderecos entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Enderecos entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Enderecos entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void find(Enderecos entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
