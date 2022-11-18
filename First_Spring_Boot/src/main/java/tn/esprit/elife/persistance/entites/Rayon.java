package tn.esprit.elife.persistance.entites;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Table_rayon")
@Getter
@Setter
public class Rayon {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idRayon")

	private long idRayon;
	private String codeRayon;
	private String libelleRayon;
	@OneToMany(cascade = CascadeType.ALL , mappedBy = "Rayon")
    private Set <Produit> produit ;	
	
}


