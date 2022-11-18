package tn.esprit.elife.persistance.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.elife.persistance.entites.Rayon;

@Repository

public interface RayonRepository extends CrudRepository<Rayon, Long> {

}
