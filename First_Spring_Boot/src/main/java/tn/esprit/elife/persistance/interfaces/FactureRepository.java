package tn.esprit.elife.persistance.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.jsf.FacesContextUtils;

import tn.esprit.elife.persistance.entites.Facture;

@Repository
public interface FactureRepository extends CrudRepository<Facture, Long> {

}
