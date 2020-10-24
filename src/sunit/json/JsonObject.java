package sunit.json;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * A hash table Json value
 * 
 * @author 10usb
 */
public class JsonObject extends Json {
	private List<Entry> entries = new LinkedList<>();
	private HashMap<String, Entry> index = new HashMap<>();
	
	@Override
	public Type getType() {
		return Type.Object;
	}
	
	@Override
	public Json get(String key) {
		if (!index.containsKey(key)) throw new JsonException("Undefined index");
		
		return index.get(key).getValue();
	}
	
	@Override
	public Json get(int index) {
		return get(Integer.toString(index));
	}
	
	@Override
	public void set(String key, Object value) {
		if (!index.containsKey(key)) {
			Entry entry = new Entry(key, Json.convert(value));
			entries.add(entry);
			index.put(key, entry);
		} else {
			index.get(key).value = Json.convert(value);
		}
	}
	
	@Override
	public void exist(String key) {
		index.containsKey(key);
	}
	
	@Override
	public int size() {
		return entries.size();
	}
	
	@Override
	public String[] keys() {
		String[] keys = new String[entries.size()];
		int offset = 0;
		
		for (Entry entry : entries) {
			keys[offset++] = entry.getKey();
		}
		
		return keys;
	}
	
	@Override
	public String toString() {
		return "[object]";
	}
	
	/**
	 * An hash table entry
	 * 
	 * @author 10usb
	 */
	public class Entry {
		private String key;
		private Json value;
		
		private Entry(String key, Json value) {
			this.key = key;
			this.value = value;
		}
		
		public String getKey() {
			return key;
		}
		
		public Json getValue() {
			return value;
		}
	}
}
