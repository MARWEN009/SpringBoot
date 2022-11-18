package tn.esprit.elife.service.interfaces;

import java.util.List;

import tn.esprit.elife.persistance.entites.DetailProduit;

public interface IDetailProduitService {
	List<DetailProduit> retrieveAllDetailProduit();
	DetailProduit addDetailProduit (DetailProduit p);
	void deleteDetailProduit (long id);
	DetailProduit updateDetailFacture (DetailProduit p);
	DetailProduit retrieveDetailProduit (long id);


}
