package tn.esprit.elife.service.classes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import tn.esprit.elife.persistance.entites.Facture;
import tn.esprit.elife.persistance.interfaces.FactureRepository;
import tn.esprit.elife.service.interfaces.IFactureService;

public class FactureService implements IFactureService{
	@Autowired
	FactureRepository factureRep;

	@Override
	public List<Facture> retrieveAllFacture() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Facture addFacture(Facture f) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteFacture(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Facture updateFacture(Facture f) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Facture retrieveFacture(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
