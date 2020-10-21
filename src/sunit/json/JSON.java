package sunit.json;

import java.util.Iterator;

public abstract class JSON implements Iterable<JSON> {
	public enum Type {
		Object, Array, String, Number, Boolean;
	}
	
	public static JSON parse(String text) {
		JsonParser parser = new JsonParser();
		return parser.parse(text);
	}
	
	public static String stringify(JSON value) {
		JsonFormatter formatter = new JsonFormatter();
		StringBuilder builder = new StringBuilder();
		formatter.toJson(builder, value);
		return builder.toString();
	}
	
	public static JSON convert(Object value) {
		JsonConverter converter = new JsonConverter();
		return converter.convert(value);
	}
	
	public abstract Type getType();
	
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
	
	@Override
	public Iterator<JSON> iterator() {
		throw new JsonException();
	}
}
