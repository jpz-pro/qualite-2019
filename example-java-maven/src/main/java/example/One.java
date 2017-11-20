package example;

import java.util.logging.Logger;

/**
 * 
 * @author Julien
 *
 */
public class One {
	String message = "foo";
	Logger log;

	/**
	 * 
	 * @return message
	 */
	public String foo() {
		return message;
	}

	/**
	 * Méthode de test
	 */
	public void uncoveredMethod() {
		log.info(foo());
	}
}
