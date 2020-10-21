package sunit.json;

public class JsonNumber extends JSON {
	private Number value;
	
	public JsonNumber(Number value) {
		this.value = value;
	}
	
	@Override
	public Type getType() {
		return Type.Number;
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
