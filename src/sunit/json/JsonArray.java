package sunit.json;

import java.util.LinkedList;

public class JsonArray extends JSON {
	private LinkedList<JSON> entries = new LinkedList<>();
	
	@Override
	public int getType() {
		return ARRAY;
	}
	
	@Override
	public JSON get(int index) {
		return entries.get(index);
	}
	
	@Override
	public void set(int index, Object value) {
		entries.set(index, JSON.convert(value));
	}
	
	@Override
	public void append(Object value) {
		entries.add(JSON.convert(value));
	}
	
	@Override
	public void insert(int index, Object value) {
		entries.add(index, JSON.convert(value));
	}

	@Override
	public JSON remove(int index) {
		return entries.remove(index);
	}
	
	@Override
	public int size() {
		return entries.size();
	}
	
	@Override
	public String toString() {
		return "[array]";
	}
}
