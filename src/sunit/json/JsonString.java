package sunit.json;

public class JsonString extends JSON {
	String value;
	
	public JsonString(String value) {
		this.value = value;
	}
	
	@Override
	public int getType() {
		return STRING;
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
