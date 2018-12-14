/**
 * 
 */
package fr.afpa.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.annotation.Transient;

/**
 * @author 34011-55-04
 *
 */
@Entity
public class Utilisateur implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <b>OBJET QUI POSSEDE LES FONCTIONNALITES SUIVANTES : </b> <br/>
	 * LES FONCTIONNALITES d'ecriture de messages de log dans la console.
	 */
	@Transient
	private static final Logger LOGGER = LoggerFactory.getLogger(Utilisateur.class);

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // strategie de generation de la clé primaire
	private Long id;

	@Column(nullable = false, unique = true)
	private String identifiant;

	@Column(nullable = false)
	private String motDePasse;

	private Date dateInscription;

	@ManyToOne
	private Personne personne;

	@ManyToOne
	private Droit droit;

	/**
	 * <b>CONSTRUCTEUR SANS ARGUMENTS</b>
	 */
	public Utilisateur() {
		super();
		Utilisateur.LOGGER.info("CLASS : Utilisateur -- METHOD : Utilisateur -- ARGUMENTS : None -- BEGIN");
		Utilisateur.LOGGER.info("CLASS : Utilisateur -- METHOD : Utilisateur -- ARGUMENTS : None -- END");
	}

	/**
	 * <b>CONSTRUCTEUR DEFINI DE LA MANIERE SUIVANTE :<b><br/>
	 * ->1 ARGUMENT POUR CHAQUE ATTRIBUT<br/>
	 * ->CLE PRIMAIRE : INCLUES<br/>
	 * ->ASSOCIATIONS : INCLUES<br/>
	 * ->TIMESTAMP : EXCLUS<br/>
	 *
	 * @param pId
	 * @param pIdentifiant
	 * @param pMotDePasse
	 * @param pPersonne
	 * @param pDroit
	 */
	public Utilisateur(final Long pId, final String pIdentifiant, final String pMotDePasse, final Personne pPersonne,
			final Droit pDroit) {
		Utilisateur.LOGGER.info(
				"CLASS : Utilisateur -- METHOD : Utilisateur -- ARGUMENTS : 1 PAR ATTRIBUT (CLE PRIMAIRE : INCLUE / ASSOCIATIONS : INCLUES) -- BEGIN");
		this.id = pId;
		this.identifiant = pIdentifiant;
		this.motDePasse = pMotDePasse;
		this.dateInscription = new Date();
		this.personne = pPersonne;
		this.droit = pDroit;

		Utilisateur.LOGGER.info(
				"CLASS : Utilisateur -- METHOD : Utilisateur -- ARGUMENTS : 1 PAR ATTRIBUT (CLE PRIMAIRE : INCLUE / ASSOCIATIONS : INCLUES) -- END");
	}

	/**
	 * <b>CONSTRUCTEUR DEFINI DE LA MANIERE SUIVANTE :<b><br/>
	 * ->1 ARGUMENT POUR CHAQUE ATTRIBUT<br/>
	 * ->CLE PRIMAIRE : EXCLUE<br/>
	 * ->ASSOCIATIONS : EXCLUES<br/>
	 * ->TIMESTAMP : EXCLUS<br/>
	 *
	 * @param pIdentifiant
	 * @param pMotDePasse
	 */
	public Utilisateur(final String pIdentifiant, final String pMotDePasse) {
		Utilisateur.LOGGER.info(
				"CLASS : Utilisateur -- METHOD : Utilisateur -- ARGUMENTS : 1 PAR ATTRIBUT (CLE PRIMAIRE : EXCLUE / ASSOCIATIONS : EXCLUES) -- BEGIN");
		this.identifiant = pIdentifiant;
		this.motDePasse = pMotDePasse;
		this.dateInscription = new Date();

		Utilisateur.LOGGER.info(
				"CLASS : Utilisateur -- METHOD : Utilisateur -- ARGUMENTS : 1 PAR ATTRIBUT (CLE PRIMAIRE : EXCLUE / ASSOCIATIONS : EXCLUES) -- END");
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @return the identifiant
	 */
	public String getIdentifiant() {
		return identifiant;
	}

	/**
	 * @return the motDePasse
	 */
	public String getMotDePasse() {
		return motDePasse;
	}

	/**
	 * @return the dateInscription
	 */
	public Date getDateInscription() {
		return dateInscription;
	}

	/**
	 * @return the personne
	 */
	public Personne getPersonne() {
		return personne;
	}

	/**
	 * @return the droit
	 */
	public Droit getDroit() {
		return droit;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @param identifiant
	 *            the identifiant to set
	 */
	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}

	/**
	 * @param motDePasse
	 *            the motDePasse to set
	 */
	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	/**
	 * @param dateInscription
	 *            the dateInscription to set
	 */
	public void setDateInscription(Date dateInscription) {
		this.dateInscription = dateInscription;
	}

	/**
	 * @param personne
	 *            the personne to set
	 */
	public void setPersonne(Personne personne) {
		this.personne = personne;
	}

	/**
	 * @param droit
	 *            the droit to set
	 */
	public void setDroit(Droit droit) {
		this.droit = droit;
	}

}
