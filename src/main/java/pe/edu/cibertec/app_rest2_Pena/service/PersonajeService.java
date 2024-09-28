package pe.edu.cibertec.app_rest2_Pena.service;

import pe.edu.cibertec.app_rest2_Pena.model.Personaje;

import java.util.List;
import java.util.Optional;

public interface PersonajeService {
    List<Personaje> findAll();
    Optional<Personaje> findById(long id);
}
