package sunit.json;

public class JsonConverter {
	public JSON convert(Object value) {
		if(value == null)
			return null;
		
		if(value instanceof JSON)
			return (JSON)value;		
		
		if(value instanceof String)
			return new JsonString((String)value);
		
		if(value instanceof Number)
			return new JsonNumber((Number)value);	
		
		if(value instanceof Boolean)
			return new JsonBoolean((Boolean)value);		
		
		throw new JsonException("Can't convert type");
	}
}
