package crud_personas_mvc.demo.repository;


import crud_personas_mvc.demo.models.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class PersonasRepository {

    @Autowired
    private PersonasCrudRepository crudRepositoryPersonas;

    public List<Persona> getPersonas(){

        return (List<Persona>) crudRepositoryPersonas.findAll();
    }

    public Optional<Persona> getPersonaById(Long id){
        return crudRepositoryPersonas.findById(id);
    }

    public void savePersona(Persona persona){
         crudRepositoryPersonas.save(persona);

    }

    public void delete(Persona persona){
        crudRepositoryPersonas.delete(persona);
    }
}
