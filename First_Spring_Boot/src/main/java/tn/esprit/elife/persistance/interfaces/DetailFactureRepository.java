package tn.esprit.elife.persistance.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.elife.persistance.entites.DetailFacture;

@Repository
public interface DetailFactureRepository extends CrudRepository<DetailFacture, Long>{

}
