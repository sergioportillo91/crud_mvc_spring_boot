package crud_personas_mvc.demo.repository;

import crud_personas_mvc.demo.models.Persona;
import org.springframework.data.repository.CrudRepository;

public interface PersonasCrudRepository extends CrudRepository<Persona, Long> {
}
