package sunit.json;

public class JsonNumber extends JSON {
	Number value;
	
	public JsonNumber(Number value) {
		this.value = value;
	}
	
	@Override
	public int getType() {
		return NUMBER;
	}

	@Override
	public Number toNumber() {
		return value;
	}
	
	@Override
	public String toString() {
		return value.toString();
	}
	
}
