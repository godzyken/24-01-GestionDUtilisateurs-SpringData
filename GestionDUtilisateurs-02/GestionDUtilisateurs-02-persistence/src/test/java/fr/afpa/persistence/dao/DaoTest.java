/**
 * 
 */
package fr.afpa.persistence.dao;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.stereotype.Component;

/**
 * <b>CLASSE QUI IMPLEMENTE LES FONCTIONNALITES SUIVANTES : <b><br/>
 * ->L'ENSEMBLE DES TESTS SUR LES DAO DE L'APPLICATION.<br/>
 * 
 * @author 34011-55-04
 *
 */
@EntityScan(basePackages = { "fr.afpa.model" })
@Component
public class DaoTest implements CommandLineRunner {

	/**
	 * <b>OBJET QUI POSSEDE LES FONCTIONNALITES SUIVANTES : </b> <br/>
	 * Les fonctionnalites d'ecriture de messages de log dans la console.
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(DaoTest.class);

	/**
	 * <b>METHODE PRINCIPALE DE LA CLASSE DE TEST PRINCIPALE</b>
	 *
	 * @param args
	 *            Une liste d'arguments.
	 */
	@Override
	public void run(final String... arg0) throws Exception {
		DaoTest.LOGGER.info("+----------+-------------------------------------+");
		DaoTest.LOGGER.info("| MODULE   | GestionDUtilisateurs-02-persistence |");
		DaoTest.LOGGER.info("| CLASSE   | DaoTest 							  |");
		DaoTest.LOGGER.info("| METHODE  | run 								  |");
		DaoTest.LOGGER.info("| POSITION | DEBUT 							  |");
		DaoTest.LOGGER.info("+----------+-------------------------------------+");
		DaoTest.LOGGER.info("+----------+-------------------------------------+");
		DaoTest.LOGGER.info("| MODULE   | GestionDUtilisateurs-02-persistence |");
		DaoTest.LOGGER.info("| CLASSE   | DaoTest  							  |");
		DaoTest.LOGGER.info("| METHODE  | run 								  |");
		DaoTest.LOGGER.info("| POSITION | FIN                              	  |");
		DaoTest.LOGGER.info("+----------+-------------------------------------+");
	}

	/**
	 * <b>METHODE QUI LANCE L'INTEGRALITE DES TESTS SUR LE MODULE.</b>
	 */
	@Test
	public void allTests() {
		DaoTest.LOGGER.info("+----------+-------------------------------------+");
		DaoTest.LOGGER.info("| MODULE   | GestionDUtilisateurs-02-persistence |");
		DaoTest.LOGGER.info("| CLASSE   | DaoTest 							  |");
		DaoTest.LOGGER.info("| METHODE  | allTests 							  |");
		DaoTest.LOGGER.info("| POSITION | DEBUT 							  |");
		DaoTest.LOGGER.info("+----------+-------------------------------------+");
		DaoTest.LOGGER.info("+----------+-------------------------------------+");
		DaoTest.LOGGER.info("| MODULE   | GestionDUtilisateurs-02-persistence |");
		DaoTest.LOGGER.info("| CLASSE   | DaoTest 							  |");
		DaoTest.LOGGER.info("| METHODE  | allTests   						  |");
		DaoTest.LOGGER.info("| POSITION | FIN 								  |");
		DaoTest.LOGGER.info("+----------+-------------------------------------+");
	}
}
