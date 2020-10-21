package sunit.json;

import java.util.Iterator;

public abstract class Json implements Iterable<Json> {
	public enum Type {
		Object, Array, String, Number, Boolean;
	}
	
	public static Json parse(String text) {
		JsonParser parser = new JsonParser();
		return parser.parse(text);
	}
	
	public static String stringify(Json value) {
		JsonFormatter formatter = new JsonFormatter();
		StringBuilder builder = new StringBuilder();
		formatter.toJson(builder, value);
		return builder.toString();
	}
	
	public static Json convert(Object value) {
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
	
	public Json get(String key) {
		throw new JsonException();
	}
	
	public Json get(int index) {
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
	
	public Json remove(int index) {
		throw new JsonException();
	}
	
	public void insert(int index, Object value) {
		throw new JsonException();
	}
	
	@Override
	public Iterator<Json> iterator() {
		throw new JsonException();
	}
}
