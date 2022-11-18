package tn.esprit.elife.persistance.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table (name = "Table_fournisseur")

@Getter
@Setter
@RequiredArgsConstructor
public class Fournisseur {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "idFournisseur")
	private long idFournisseur;
	private String codeFournisseur;
	private String libelleFournisseur;

}
