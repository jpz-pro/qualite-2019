package example;

public class Five {
	private String message;

	public String intToString(int unEntier) {
		String res = new Integer(unEntier).toString();
		return res;
	}

	public String intToString1(int unEntier) {
		return (new Integer(unEntier)).toString();
	}

	public String intToString2(int unEntier) {
		String res = Integer.valueOf(unEntier).toString();
		return res;
	}

	public String intToString3(int unEntier) {
		String res = unEntier + "";
		return res;
	}
}
