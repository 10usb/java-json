package sunit.json;

import java.util.HashMap;

public class JsonObject extends JSON {
	HashMap<String, JSON> entries = new HashMap<>();
	
	@Override
	public int getType() {
		return OBJECT;
	}
	
	@Override
	public JSON get(String key) {
		return entries.get(key);
	}
	
	@Override
	public JSON get(int index) {
		throw new JsonException();
	}
	
	@Override
	public void set(String key, Object value) {
		entries.put(key, JSON.convert(value));
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