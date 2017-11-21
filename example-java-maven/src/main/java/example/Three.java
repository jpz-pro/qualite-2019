package example;

import java.util.logging.Logger;

/**
 * 
 * @author Julien
 *
 */
public class Three {
	String message = "foo";
	Logger log;

	/**
	 * 
	 * @param two
	 * @return les messages concaténés
	 */
	public String concat(Two two) {
		String result = message + two.message;
		return result;
	}

	public String concat2(One one) {
		return message + one.foo().toString();
	}

	public String concat3(One one, Two two) {
		String result = message + "_" + one.foo() + "-" + two.message;
		log.info(result);
		return result;
	}

	public String concat4(Two two) {
		String result = message + two.message;
		return result;
	}
}
