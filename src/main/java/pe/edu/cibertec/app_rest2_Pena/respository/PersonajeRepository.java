package pe.edu.cibertec.app_rest2_Pena.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.app_rest2_Pena.model.Personaje;

@Repository
public interface PersonajeRepository extends JpaRepository<Personaje, Long> {
}
