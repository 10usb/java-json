package sunit.json;

public class JsonConverter {
	public Json convert(Object value) {
		if (value == null) return null;
		
		if (value instanceof Json) return (Json) value;
		
		if (value instanceof String) return new JsonString((String) value);
		
		if (value instanceof Number) return new JsonNumber((Number) value);
		
		if (value instanceof Boolean) return new JsonBoolean((Boolean) value);
		
		throw new JsonException("Can't convert type");
	}
}
