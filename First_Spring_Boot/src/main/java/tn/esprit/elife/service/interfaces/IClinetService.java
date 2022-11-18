package tn.esprit.elife.service.interfaces;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import tn.esprit.elife.persistance.entites.Client;
import tn.esprit.elife.persistance.entites.Profession;

public interface IClinetService {
	

	List<Client> retrieveAllClients();
	Client addClient (Client c);
	void deleteClient (long id);
	Client updateClient (Client c);
	Client retrieveClient (long id);
	List <Client> chercherClientByProfession(Profession prof);
	
	
}
