package tn.esprit.elife.service.classes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import tn.esprit.elife.persistance.entites.Rayon;
import tn.esprit.elife.persistance.interfaces.RayonRepository;
import tn.esprit.elife.service.interfaces.IRayonService;

public class RayonService implements IRayonService {

	@Autowired
	RayonRepository rayonRep;
	
	@Override
	public List<Rayon> retrieveAllRayon() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Rayon addDetailRayon(Rayon r) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteRayon(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Rayon updateRayon(Rayon r) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Rayon retrieveRayon(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
