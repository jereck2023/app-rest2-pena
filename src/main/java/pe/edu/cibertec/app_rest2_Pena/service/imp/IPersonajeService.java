package pe.edu.cibertec.app_rest2_Pena.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.app_rest2_Pena.model.Personaje;
import pe.edu.cibertec.app_rest2_Pena.respository.PersonajeRepository;
import pe.edu.cibertec.app_rest2_Pena.service.PersonajeService;

import java.util.List;
import java.util.Optional;

@Service
public class IPersonajeService implements PersonajeService {

    @Autowired
    private PersonajeRepository personajeRepository;
    @Override
    public List<Personaje> findAll() {
        return personajeRepository.findAll();
    }

    @Override
    public Optional<Personaje> findById(long id) {
        return personajeRepository.findById(id);
    }
}
