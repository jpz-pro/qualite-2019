package example;

/**
 * 
 * @author Julien
 *
 */
public class Two {
	String message = "foo";

	/**
	 * 
	 * @param one
	 *            classe One
	 * @return "ERREUR" ou "SUCCES"
	 */
	public String comp(One one) {
		if (this.compareTo(one) == -1)
			return "ERREUR";
		return "SUCCES";
	}

	private int compareTo(One one) {
		return message.compareTo(one.foo());
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this.message.equals(obj))
			return true;
		return false;
	}
}
