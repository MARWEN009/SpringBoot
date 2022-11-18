package tn.esprit.elife.persistance.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.elife.persistance.entites.Produit;

@Repository
public interface ProduitRepository extends CrudRepository<Produit, Long> {

}
