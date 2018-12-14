package fr.afpa.model;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.slf4j.LoggerFactory;
import org.springframework.data.annotation.Transient;

/**
 * @author 34011-55-04
 * 
 *         <b>CLASSE QUI IMPLEMENTE LA METHODE D'ENTREE DE L'APPLICATION</b>
 *
 */
@Entity
public class Droit implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <b>OBJET QUI POSSEDE LES FONCTIONNALITES SUIVANTES : </b> <br/>
	 * LES FONCTIONNALITES D'ECRITURE DE MESSAGES DE LOG DANS LA CONSOLE.
	 */
	@Transient
	private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(Droit.class);

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // strategie de generation de la clé primaire
	private long id;

	@Column(nullable = false, unique = true)
	private String libelle;

	@OneToMany(mappedBy = "droit")
	private Collection<Utilisateur> utilisateurs;

	/**
	 * <b>CONSTRUCTEUR SANS ARGUMENTS</b>
	 */
	public Droit() {
		super();
		Droit.LOGGER.info("CLASS : Droit -- METHOD : Droit -- ARGUMENTS : None -- BEGIN");
		Droit.LOGGER.info("CLASS : Droit -- METHOD : Droit -- ARGUMENTS : None – END");
	}

	/**
	 * <b>CONSTRUCTEUR DEFINI DE LA MANIERE SUIVANTE :<b><br/>
	 * ->1 ARGUMENT POUR CHAQUE ATTRIBUT<br/>
	 * ->CLE PRIMAIRE : INCLUES<br/>
	 * ->ASSOCIATIONS : EXCLUES<br/>
	 * ->TIMESTAMP : EXCLUS<br/>
	 *
	 * @param pId
	 * @param pLibelle
	 */
	public Droit(final Long pId, final String pLibelle) {
		Droit.LOGGER.info(
				"CLASS : Droit -- METHOD : Droit -- ARGUMENTS : 1 PAR ATTRIBUT (CLE PRIMAIRE : INCLUE / ASSOCIATIONS : EXCLUES) -- BEGIN");
		this.id = pId;
		this.libelle = pLibelle;

		Droit.LOGGER.info(
				"CLASS : Droit -- METHOD : Droit -- ARGUMENTS : 1 PAR ATTRIBUT (CLE PRIMAIRE : INCLUE / ASSOCIATIONS : EXCLUES) -- END");
	}

	/**
	 * <b>CONSTRUCTEUR DEFINI DE LA MANIERE SUIVANTE :<b><br/>
	 * ->1 ARGUMENT POUR CHAQUE ATTRIBUT<br/>
	 * ->CLE PRIMAIRE : EXCLUE<br/>
	 * ->ASSOCIATIONS : EXCLUES<br/>
	 * ->TIMESTAMP : EXCLUS<br/>
	 *
	 * @param pLibelle
	 */
	public Droit(final String pLibelle) {
		Droit.LOGGER.info(
				"CLASS : Droit -- METHOD : Droit -- ARGUMENTS : 1 PAR ATTRIBUT (CLE PRIMAIRE : EXCLUE / ASSOCIATIONS : EXCLUES) -- BEGIN");
		this.libelle = pLibelle;

		Droit.LOGGER.info(
				"CLASS : Droit -- METHOD : Droit -- ARGUMENTS : 1 PAR ATTRIBUT (CLE PRIMAIRE : EXCLUE / ASSOCIATIONS : EXCLUES) -- END");
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}

	/**
	 * @return the utilisateurs
	 */
	public Collection<Utilisateur> getUtilisateurs() {
		return utilisateurs;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @param libelle
	 *            the libelle to set
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	/**
	 * @param utilisateurs
	 *            the utilisateurs to set
	 */
	public void setUtilisateurs(Collection<Utilisateur> utilisateurs) {
		this.utilisateurs = utilisateurs;
	}

}
