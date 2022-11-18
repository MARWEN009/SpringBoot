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

import org.hibernate.annotations.GeneratorType;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Tabl_stock")
@Getter
@Setter
@RequiredArgsConstructor
public class Stock {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idStock")

	private long idStock;
	private int qteStock;
	private int qteMin;
	private String libelleStock;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "Stock")
	private Set<Produit> produit;
}
