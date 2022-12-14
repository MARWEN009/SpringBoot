package tn.esprit.elife.persistance.entites;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Cascade;

@Entity
@Table(name = "Table_client")
public class Client implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idClient")
	private Long idClient; // Clé primaire
	private String nom;
	private String prenom;
	private String email;
	private String password;
	@Temporal(TemporalType.DATE)
	private Date dateNaissance;
	@Enumerated(EnumType.STRING)
	private Profession profession;
	@Enumerated(EnumType.STRING)
	private CategorieClient categorieClient;
	
	public Client() {

	}

	public Long getIdClient() {
		return idClient;
	}

	public void setIdClient(Long idClient) {
		this.idClient = idClient;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	@OneToMany(cascade = CascadeType.ALL, mappedBy="client")
	private Set<Facture> facture;


	
}

