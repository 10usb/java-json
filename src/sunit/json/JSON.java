package sunit.json;

public abstract class JSON {
	public static final int OBJECT = 0;
	public static final int ARRAY = 1;
	public static final int STRING = 2;
	public static final int NUMBER = 3;
	public static final int BOOLEAN = 4;
	
	public static JSON parse(String text) {
		JsonParser parser = new JsonParser();
		return parser.parse(text);
	}
	
	public static String stringify(JSON value) {
		JsonFormatter formatter = new JsonFormatter();
		return formatter.toJson(value);
	}
	
	public static JSON convert(Object value) {
		JsonConverter converter = new JsonConverter();
		return converter.convert(value);
	}
	
	public abstract int getType();
	
	public boolean toBoolean() {
		throw new JsonException();
	}
	
	public Number toNumber() {
		throw new JsonException();
	}
	
	public abstract String toString();
	
	public JSON get(String key) {
		throw new JsonException();
	}
	
	public JSON get(int index) {
		throw new JsonException();
	}
	
	public void set(String key, Object value) {
		throw new JsonException();
	}
	
	public void set(int index, Object value) {
		throw new JsonException();
	}
	
	public void exist(String key) {
		throw new JsonException();
	}
	
	public int size() {
		throw new JsonException();
	}
	
	public String[] keys() {
		throw new JsonException();
	}
	
	public void append(Object value) {
		throw new JsonException();
	}
	
	public JSON remove(int index) {
		throw new JsonException();
	}
	
	public void insert(int index, Object value) {
		throw new JsonException();
	}
}
