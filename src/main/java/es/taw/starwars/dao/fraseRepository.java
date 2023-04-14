package es.taw.starwars.dao;

import es.taw.starwars.entity.FraseCelebre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface fraseRepository extends JpaRepository<FraseCelebre, Integer> {

}
