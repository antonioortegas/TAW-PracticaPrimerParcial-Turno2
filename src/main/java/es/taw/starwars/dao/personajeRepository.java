package es.taw.starwars.dao;

import es.taw.starwars.entity.Personaje;
import org.springframework.data.jpa.repository.JpaRepository;

public interface personajeRepository extends JpaRepository<Personaje, Integer> {
}
