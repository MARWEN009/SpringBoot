package tn.esprit.elife.service.interfaces;

import java.util.List;

import tn.esprit.elife.persistance.entites.Stock;

public interface IStockService {
	List<Stock> retrieveAllService ();
	Stock adService (Stock s);
	void deleteService  (long id);
	Stock updateService  (Stock s);
	Stock retrieveService (long id);
}