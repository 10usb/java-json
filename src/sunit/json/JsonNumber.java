package sunit.json;

/**
 * A numeric Json value
 * 
 * @author 10usb
 */
public class JsonNumber extends Json {
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
