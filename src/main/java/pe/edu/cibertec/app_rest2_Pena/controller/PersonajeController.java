package pe.edu.cibertec.app_rest2_Pena.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.app_rest2_Pena.model.Personaje;
import pe.edu.cibertec.app_rest2_Pena.service.PersonajeService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/personajeNR")
public class PersonajeController {

    @Autowired
    private PersonajeService personajeservice;

    @GetMapping
    public List<Personaje> findAll() {

        return personajeservice.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Personaje> findById(@PathVariable Long id) {

        return personajeservice.findById(id);
    }
}
