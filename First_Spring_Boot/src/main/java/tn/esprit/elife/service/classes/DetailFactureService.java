package tn.esprit.elife.service.classes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import tn.esprit.elife.persistance.entites.DetailProduit;
import tn.esprit.elife.persistance.interfaces.DetailFactureRepository;
import tn.esprit.elife.service.interfaces.IDetailProduitService;

public class DetailFactureService implements IDetailProduitService {
	@Autowired
	DetailFactureRepository detailFactureRep;

	@Override
	public List<DetailProduit> retrieveAllDetailProduit() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DetailProduit addDetailProduit(DetailProduit p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteDetailProduit(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public DetailProduit updateDetailFacture(DetailProduit p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DetailProduit retrieveDetailProduit(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
