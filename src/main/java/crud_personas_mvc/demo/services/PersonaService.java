package crud_personas_mvc.demo.services;


import crud_personas_mvc.demo.models.Persona;
import crud_personas_mvc.demo.repository.PersonasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaService {

    @Autowired
    private PersonasRepository repositoryPersonas;
    public List<Persona> ListarPersonas(){
       return repositoryPersonas.getPersonas();
    }

    public Optional<Persona> getPersonaPorId(Long id){
        return repositoryPersonas.getPersonaById(id);
    }

    public Persona guardarPersona(Persona persona){
        return repositoryPersonas.savePersona(persona);
    }

    public void eliminar(Persona persona){
        repositoryPersonas.delete(persona);
    }

}
