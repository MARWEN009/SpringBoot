package tn.esprit.elife.service.interfaces;

import java.util.List;

import tn.esprit.elife.persistance.entites.DetailFacture;
import tn.esprit.elife.persistance.entites.Produit;

public interface IDetailFactureService  {
	List<DetailFacture> retrieveAllDetailFacture();
	DetailFacture addDetailFacture (DetailFacture f);
	void deleteDetailFacture (long id);
	DetailFacture updateDetailFacture (DetailFacture f);
	DetailFacture retrieveDetailFacture (long id);


}
