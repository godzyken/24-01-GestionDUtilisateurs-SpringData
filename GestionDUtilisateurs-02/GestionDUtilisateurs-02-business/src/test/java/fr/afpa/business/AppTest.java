package fr.afpa.business;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Unit test for simple App. <b>CLASSE QUI IMPLEMENTE LES FONCTIONNALITES
 * SUIVANTES : </b><br/>
 * ->LE LANCEMENT DES TESTS SUR LE MODULE.<br/>
 * 
 * @author 34011-55-04
 */
@ComponentScan(basePackages = { "fr.afpa.persistence" })
@RunWith(SpringRunner.class)
@SpringBootTest(classes = AppTest.class)
public class AppTest implements CommandLineRunner {

    /**
     * <b>OBJET QUI POSSEDE LES FONCTIONNALITES SUIVANTES : </b> <br/>
     * Les fonctionnalites d'ecriture de messages de log dans la console.
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(AppTest.class);

    /**
     * <b>METHODE PRINCIPALE DE LA CLASSE DE TEST PRINCIPALE</b>
     *
     * @param args
     *            Une liste d'arguments.
     */
    @Override
    public void run(final String... argO) throws Exception {

	AppTest.LOGGER.info("+----------+-------------------------------------+");
	AppTest.LOGGER.info("| MODULE | GestionDUtilisateurs-02-persistence |");
	AppTest.LOGGER.info("| CLASSE | AppTest |");
	AppTest.LOGGER.info("| METHODE | run |");
	AppTest.LOGGER.info("| POSITION | DEBUT |");
	AppTest.LOGGER.info("+----------+-------------------------------------+");
	AppTest.LOGGER.info("+----------+-------------------------------------+");
	AppTest.LOGGER.info("| MODULE | GestionDUtilisateurs-02-persistence |");
	AppTest.LOGGER.info("| CLASSE | AppTest |");
	AppTest.LOGGER.info("| METHODE | run |");
	AppTest.LOGGER.info("| POSITION | FIN |");
	AppTest.LOGGER.info("+----------+-------------------------------------+");

    }

    /**
     * <b>METHODE QUI LANCE L'INTEGRALITE DES TESTS SUR LE MODULE.</b>
     */
    @Test
    public void allTests() {
	AppTest.LOGGER.info("+----------+-------------------------------------+");
	AppTest.LOGGER.info("| MODULE | GestionDUtilisateurs-02-persistence |");
	AppTest.LOGGER.info("| CLASSE | AppTest |");
	AppTest.LOGGER.info("| METHODE | allTests |");
	AppTest.LOGGER.info("| POSITION | DEBUT |");
	AppTest.LOGGER.info("+----------+-------------------------------------+");
	AppTest.LOGGER.info("+----------+-------------------------------------+");
	AppTest.LOGGER.info("| MODULE | GestionDUtilisateurs-02-persistence |");
	AppTest.LOGGER.info("| CLASSE | AppTest |");
	AppTest.LOGGER.info("| METHODE | allTests |");
	AppTest.LOGGER.info("| POSITION | FIN |");
	AppTest.LOGGER.info("+----------+-------------------------------------+");
    }
}
