package sunit.json;

/**
 * A boolean Json value
 * 
 * @author 10usb
 */
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
