package tn.esprit.elife.service.classes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import tn.esprit.elife.persistance.entites.Produit;
import tn.esprit.elife.persistance.interfaces.ProduitRepository;
import tn.esprit.elife.service.interfaces.IProduitService;

public class ProduitService implements IProduitService {
	@Autowired
	ProduitRepository produitRep;

	@Override
	public List<Produit> retrieveAllProduit() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Produit addProduit(Produit p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteProduit(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Produit updateProduit(Produit p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Produit retrieveProduit(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
