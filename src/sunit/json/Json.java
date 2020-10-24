package sunit.json;

import java.util.Iterator;

/**
 * The abstract base for any Json value
 * 
 * @author 10usb
 */
public abstract class Json implements Iterable<Json> {
	/**
	 * THe types of values that exist
	 * 
	 * @author 10usb
	 */
	public enum Type {
		Object, Array, String, Number, Boolean;
	}
	
	/**
	 * Parses a string to Json structures
	 * 
	 * @param text
	 * @return
	 */
	public static Json parse(String text) {
		JsonParser parser = new JsonParser();
		return parser.parse(text);
	}
	
	/**
	 * Turns a Json data structure into a string
	 * 
	 * @param value
	 * @return
	 */
	public static String stringify(Json value) {
		JsonFormatter formatter = new JsonFormatter();
		StringBuilder builder = new StringBuilder();
		formatter.toJson(builder, value);
		return builder.toString();
	}
	
	/**
	 * To convert any supported type into a Json value
	 * 
	 * @param value
	 * @return
	 */
	public static Json convert(Object value) {
		JsonConverter converter = new JsonConverter();
		return converter.convert(value);
	}
	
	/**
	 * To get the type of the Json value
	 * 
	 * @return
	 */
	public abstract Type getType();
	
	/**
	 * To get a boolean value from the Json value
	 * 
	 * @return
	 */
	public boolean toBoolean() {
		throw new JsonException();
	}
	
	/**
	 * To get a number value of the Json value
	 * 
	 * @return
	 */
	public Number toNumber() {
		throw new JsonException();
	}
	
	/**
	 * To get a string value of the Json value
	 */
	public abstract String toString();
	
	/**
	 * To get a Json value with the given key from this Json value
	 * 
	 * @param key
	 * @return
	 */
	public Json get(String key) {
		throw new JsonException();
	}
	
	/**
	 * To get a Json value with the given index from this Json value
	 * 
	 * @param index
	 * @return
	 */
	public Json get(int index) {
		throw new JsonException();
	}
	
	/**
	 * To set a value with the given key from this Json value
	 * 
	 * @param key
	 * @param value
	 */
	public void set(String key, Object value) {
		throw new JsonException();
	}
	
	/**
	 * To set a value with the given index from this Json value
	 * 
	 * @param index
	 * @param value
	 */
	public void set(int index, Object value) {
		throw new JsonException();
	}
	
	/**
	 * To check if an key exists
	 * 
	 * @param key
	 */
	public void exist(String key) {
		throw new JsonException();
	}
	
	/**
	 * To get the number of entries
	 * 
	 * @return
	 */
	public int size() {
		throw new JsonException();
	}
	
	/**
	 * To get the keys
	 * 
	 * @return
	 */
	public String[] keys() {
		throw new JsonException();
	}
	
	/**
	 * Add a value to the end of this Json value
	 * 
	 * @param value
	 */
	public void append(Object value) {
		throw new JsonException();
	}
	
	/**
	 * Remove a Json value at the given index
	 * 
	 * @param index
	 * @return
	 */
	public Json remove(int index) {
		throw new JsonException();
	}
	
	/**
	 * Insert a Json value at a given index
	 * 
	 * @param index
	 * @param value
	 */
	public void insert(int index, Object value) {
		throw new JsonException();
	}
	
	@Override
	public Iterator<Json> iterator() {
		throw new JsonException();
	}
}
