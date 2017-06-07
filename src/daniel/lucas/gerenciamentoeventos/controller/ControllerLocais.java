package daniel.lucas.gerenciamentoeventos.controller;

import daniel.lucas.gerenciamentoeventos.entities.Locais;
import daniel.lucas.gerenciamentoeventos.repository.LocaisRepository;
import java.util.List;


public class ControllerLocais implements ControllerAwareInterface {
    public List<Locais> list()
    {
        LocaisRepository repoLocais = new LocaisRepository();
        return repoLocais.findAll();
    }
}
