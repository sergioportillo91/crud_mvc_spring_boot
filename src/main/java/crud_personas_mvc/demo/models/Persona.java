package crud_personas_mvc.demo.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Persona {
    private String nombres;
    private String primerApellido;
    private String segundoApellido;
    private  String email;
    private String telefono;

}
