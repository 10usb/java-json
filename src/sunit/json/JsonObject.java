package sunit.json;

import java.util.HashMap;

public class JsonObject extends Json {
	private HashMap<String, Json> entries = new HashMap<>();
	
	@Override
	public Type getType() {
		return Type.Object;
	}
	
	@Override
	public Json get(String key) {
		return entries.get(key);
	}
	
	@Override
	public Json get(int index) {
		return get(Integer.toString(index));
	}
	
	@Override
	public void set(String key, Object value) {
		entries.put(key, Json.convert(value));
	}
	
	@Override
	public void exist(String key) {
		entries.containsKey(key);
	}
	
	@Override
	public int size() {
		return entries.size();
	}
	
	@Override
	public String[] keys() {
		return entries.keySet().toArray(new String[entries.size()]);
	}
	
	@Override
	public String toString() {
		return "[object]";
	}
}
