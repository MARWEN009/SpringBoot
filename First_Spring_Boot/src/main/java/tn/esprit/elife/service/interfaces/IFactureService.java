package tn.esprit.elife.service.interfaces;

import java.util.List;

import tn.esprit.elife.persistance.entites.DetailFacture;
import tn.esprit.elife.persistance.entites.Facture;

public interface IFactureService {
	List<Facture> retrieveAllFacture();
	Facture addFacture (Facture f);
	void deleteFacture (long id);
	Facture updateFacture (Facture f);
	Facture retrieveFacture (long id);
}
