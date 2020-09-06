package example;

public class One {
	String message = "foo";

	public String foo() {
		return message;
	}

	/**
	 * Méthode de test
	 */
	private void unusedMethod() {
		System.out.println(foo());
	}
}