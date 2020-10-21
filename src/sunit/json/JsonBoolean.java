package sunit.json;

public class JsonBoolean extends Json {
	private boolean value;
	
	public JsonBoolean(boolean value) {
		this.value = value;
	}
	
	@Override
	public Type getType() {
		return Type.Boolean;
	}
	
	@Override
	public boolean toBoolean() {
		return value;
	}
	
	@Override
	public String toString() {
		return value ? "true" : "false";
	}
}
