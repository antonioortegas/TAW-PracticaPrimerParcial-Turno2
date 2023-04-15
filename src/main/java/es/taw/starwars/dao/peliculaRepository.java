package es.taw.starwars.dao;

import es.taw.starwars.entity.FraseCelebre;
import es.taw.starwars.entity.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;

public interface peliculaRepository extends JpaRepository<Pelicula, Integer> {


}
