package sunit.json;

public class JsonBoolean extends JSON {
	private boolean value;
	
	public JsonBoolean(boolean value) {
		this.value = value;
	}
	
	@Override
	public int getType() {
		return BOOLEAN;
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
