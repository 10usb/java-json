package sunit.json;

public class JsonException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public JsonException() {
		super();
	}
	
	public JsonException(String message) {
		super(message);
	}	
}