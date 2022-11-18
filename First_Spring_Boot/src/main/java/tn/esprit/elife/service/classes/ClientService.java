package tn.esprit.elife.service.classes;

import java.util.List;

import javax.sound.midi.MidiDevice.Info;

import org.hibernate.annotations.common.util.impl.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.elife.persistance.entites.Client;
import tn.esprit.elife.persistance.entites.Profession;
import tn.esprit.elife.persistance.interfaces.ClientRepository;
import tn.esprit.elife.service.interfaces.IClinetService;

@Service
public class ClientService implements IClinetService {
	@Autowired
	ClientRepository clientrep;

	@Override
	public List<Client> retrieveAllClients() {
		return (List<Client>) clientrep.findAll();
	}

	@Override
	public Client addClient(Client c) {
		return clientrep.save(c);

	}

	@Override
	public void deleteClient(long id) {

		if (clientrep.findById(id).isPresent()) {

			clientrep.deleteById(id);
		}

	}

	@Override
	public Client updateClient(Client c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Client retrieveClient(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Client> chercherClientByProfession(Profession prof) {

		return clientrep.findClientByProfession(prof);
	}

}
