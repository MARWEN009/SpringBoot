package tn.esprit.elife.service.interfaces;

import java.util.List;

import tn.esprit.elife.persistance.entites.Client;
import tn.esprit.elife.persistance.entites.Produit;
import tn.esprit.elife.persistance.entites.Profession;

public interface IProduitService {
	List<Produit> retrieveAllProduit();
	Produit addProduit (Produit p);
	void deleteProduit (long id);
	Produit updateProduit (Produit p);
	Produit retrieveProduit (long id);

	
	
}
