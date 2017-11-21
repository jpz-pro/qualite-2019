package example;

// import javax.annotation.CheckForNull;

public class Four {
	String message;

	// @CheckForNull
	public String getMessage() {
		return message;
	}

	public void setString(String msg) {
		this.message = msg;
	}

	public boolean isMessageEmpty() {
		return getMessage().length() == 0;
	}
}
