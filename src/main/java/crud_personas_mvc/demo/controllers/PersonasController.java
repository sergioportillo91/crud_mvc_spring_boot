package crud_personas_mvc.demo.controllers;

import crud_personas_mvc.demo.models.Persona;
import crud_personas_mvc.demo.services.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

@Controller
public class PersonasController {
    @Autowired
    private PersonaService personaService;
    @GetMapping("/")
    public String inicio(Model model){
      var personas =  personaService.ListarPersonas();
      model.addAttribute("personas",personas);
      return "index";
    }

    @GetMapping("/agregar")
    public String agregarFormulario(Persona persona){
        return "agregar";
    }

    @PostMapping("/guardar")
    public String guardar(Persona persona){
        personaService.guardarPersona(persona);
        return "redirect:/";
    }

    @GetMapping("/editar/{id}")
    public String editar(Optional<Persona> persona, Model model){
        persona = personaService.getPersonaPorId(persona.get().getId());
        model.addAttribute("persona",persona);
        return "agregar";
    }

    @GetMapping("/eliminar/{id}")
    public String Eliminar(Persona persona){
        personaService.eliminar(persona);
        return "redirect:/";
    }

}
