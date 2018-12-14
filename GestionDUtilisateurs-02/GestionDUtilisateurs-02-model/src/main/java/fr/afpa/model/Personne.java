/**
 * 
 */
package fr.afpa.model;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.annotation.Transient;

/**
 * @author 34011-55-04
 *
 */
@Entity
public class Personne implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <b>OBJET QUI POSSEDE LES FONCTIONNALITES SUIVANTES : </b> <br/>
	 * LES FONCTIONNALITES d'ecriture de messages de log dans la console.
	 */
	@Transient
	private static final Logger LOGGER = LoggerFactory.getLogger(Personne.class);

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // strategie de generation de la clé primaire
	private long id;

	private String nom;

	private String prenom;

	@Column(nullable = false, unique = true)
	private String mail;

	@OneToMany(mappedBy = "personne")
	private Collection<Utilisateur> utilisateurs;

	/**
	 * <b>CONSTRUCTEUR SANS ARGUMENTS</b>
	 */
	public Personne() {
		super();
		Personne.LOGGER.info("CLASS : Personne -- METHOD : Personne -- ARGUMENTS : None -- BEGIN");
		Personne.LOGGER.info("CLASS : Personne -- METHOD : Personne -- ARGUMENTS : None -- END");
	}

	/**
	 * <b>CONSTRUCTEUR DEFINI DE LA MANIERE SUIVANTE :<b><br/>
	 * ->1 ARGUMENT POUR CHAQUE ATTRIBUT<br/>
	 * ->CLE PRIMAIRE : INCLUES<br/>
	 * ->ASSOCIATIONS : EXCLUES<br/>
	 * ->TIMESTAMP : EXCLUS<br/>
	 *
	 * @param pId
	 * @param pNom
	 * @param pPrenom
	 * @param pMail
	 */
	public Personne(final Long pId, final String pNom, final String pPrenom, final String pMail) {
		Personne.LOGGER.info(
				"CLASS : Personne -- METHOD : Personne -- ARGUMENTS : 1 PAR ATTRIBUT (CLE PRIMAIRE : INCLUE / ASSOCIATIONS : EXCLUES) -- BEGIN");
		this.id = pId;
		this.nom = pNom;
		this.prenom = pPrenom;
		this.mail = pMail;

		Personne.LOGGER.info(
				"CLASS : Personne -- METHOD : Personne -- ARGUMENTS : 1 PAR ATTRIBUT (CLE PRIMAIRE : INCLUE / ASSOCIATIONS : EXCLUES) -- END");
	}

	/**
	 * <b>CONSTRUCTEUR DEFINI DE LA MANIERE SUIVANTE :<b><br/>
	 * ->1 ARGUMENT POUR CHAQUE ATTRIBUT<br/>
	 * ->CLE PRIMAIRE : EXCLUE<br/>
	 * ->ASSOCIATIONS : EXCLUES<br/>
	 * ->TIMESTAMP : EXCLUS<br/>
	 *
	 * @param pNom
	 * @param pPrenom
	 * @param pMail
	 */
	public Personne(final String pNom, final String pPrenom, final String pMail) {
		Personne.LOGGER.info(
				"CLASS : Personne -- METHOD : Personne -- ARGUMENTS : 1 PAR ATTRIBUT (CLE PRIMAIRE : EXCLUE / ASSOCIATIONS : EXCLUES) -- BEGIN");
		this.nom = pNom;
		this.prenom = pPrenom;
		this.mail = pMail;

		Personne.LOGGER.info(
				"CLASS : Personne -- METHOD : Personne -- ARGUMENTS : 1 PAR ATTRIBUT (CLE PRIMAIRE : EXCLUE / ASSOCIATIONS : EXCLUES) -- END");
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @return the mail
	 */
	public String getMail() {
		return mail;
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
	 * @param nom
	 *            the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @param prenom
	 *            the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * @param mail
	 *            the mail to set
	 */
	public void setMail(String mail) {
		this.mail = mail;
	}

	/**
	 * @param utilisateurs
	 *            the utilisateurs to set
	 */
	public void setUtilisateurs(Collection<Utilisateur> utilisateurs) {
		this.utilisateurs = utilisateurs;
	}

}
