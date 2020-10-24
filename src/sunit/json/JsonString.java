package sunit.json;

public class JsonString extends Json {
	private String value;
	
	public JsonString(String value) {
		this.value = value;
	}
	
	@Override
	public Type getType() {
		return Type.String;
	}
	
	@Override
	public int size() {
		return value.length();
	}
	
	@Override
	public String toString() {
		return value;
	}
}
