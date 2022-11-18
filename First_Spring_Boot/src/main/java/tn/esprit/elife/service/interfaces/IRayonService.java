package tn.esprit.elife.service.interfaces;

import java.util.List;

import tn.esprit.elife.persistance.entites.DetailProduit;
import tn.esprit.elife.persistance.entites.Rayon;

public interface IRayonService {
	List<Rayon> retrieveAllRayon();
	Rayon addDetailRayon (Rayon r);
	void deleteRayon (long id);
	Rayon updateRayon (Rayon r);
	Rayon retrieveRayon (long id);

}