package sunit.json;

/**
 * A class used for converting objects into Json objects
 * 
 * @author 10usb
 */
public class JsonConverter {
	/**
	 * Convert a Java object into a Json value
	 * 
	 * @param value
	 * @return
	 */
	public Json convert(Object value) {
		if (value == null) return null;
		
		if (value instanceof Json) return (Json) value;
		
		if (value instanceof String) return new JsonString((String) value);
		
		if (value instanceof Number) return new JsonNumber((Number) value);
		
		if (value instanceof Boolean) return new JsonBoolean((Boolean) value);
		
		throw new JsonException("Can't convert type");
	}
}
