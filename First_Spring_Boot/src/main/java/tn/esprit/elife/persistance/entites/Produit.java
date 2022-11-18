package tn.esprit.elife.persistance.entites;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity 
@Table(name="Table_produit")
@Getter
@Setter
@RequiredArgsConstructor
public class Produit implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idClient")
	private long idProduit;
	private String codeProduit;
	private String libelleProduit;
	private float prixUnitaire;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy="Produit")
	 DetailFacture detailFacture;
	
	
	
	@ManyToOne
	private Stock stock;
	
	@ManyToOne
	private Rayon rayon;
	
	@ManyToMany(cascade = CascadeType.ALL)
		private Set<Fournisseur> fournisseur;
	
	
}
