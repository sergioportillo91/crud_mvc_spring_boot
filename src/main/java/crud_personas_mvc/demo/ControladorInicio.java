package crud_personas_mvc.demo;


import crud_personas_mvc.demo.models.Persona;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class ControladorInicio {
    @GetMapping("/")
    public String paginaInicio(Model modelo){
        Persona persona = new Persona("Sergio Luis","Portillo","Arteaga","sergiotello83@hotmail.com","3134251010");
        Persona persona1 = new Persona("Camilo Andres","Portillo","Arteaga","camiloportillo@hotmail.com","3134341053");
        Persona persona2 = new Persona("Edilsa Isabel","Arteaga","Arteaga","edilsaarteaga62@hotmail.com","3114301053");
        Persona persona3 = new Persona("Emeterio","Portillo","Martinez","emeterioportillo@hotmail.com","3107020806");
        ArrayList<Persona> listaPersonas = new ArrayList<>();
        listaPersonas.add(persona);
        listaPersonas.add(persona1);
        listaPersonas.add(persona2);
        listaPersonas.add(persona3);
        modelo.addAttribute("personas",listaPersonas);
        return "index";
    }
}
