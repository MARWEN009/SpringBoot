package tn.esprit.elife.service.classes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import tn.esprit.elife.persistance.entites.Stock;
import tn.esprit.elife.persistance.interfaces.StockRepository;
import tn.esprit.elife.service.interfaces.IStockService;

public class StockService implements IStockService{
	@Autowired
	StockRepository stockRep;

	@Override
	public List<Stock> retrieveAllService() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Stock adService(Stock s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteService(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Stock updateService(Stock s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Stock retrieveService(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
