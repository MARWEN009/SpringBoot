package tn.esprit.elife.persistance.interfaces;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.elife.persistance.entites.Client;
import tn.esprit.elife.persistance.entites.Profession;

@Repository
public interface ClientRepository extends CrudRepository<Client, Long> {
List <Client> findClientByProfession(Profession prof);
}
