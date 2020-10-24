package sunit.json;

import java.util.Iterator;
import java.util.LinkedList;

public class JsonArray extends Json {
	private LinkedList<Json> entries = new LinkedList<>();
	
	@Override
	public Type getType() {
		return Type.Array;
	}
	
	@Override
	public Json get(int index) {
		return entries.get(index);
	}
	
	@Override
	public void set(int index, Object value) {
		entries.set(index, Json.convert(value));
	}
	
	@Override
	public void append(Object value) {
		entries.add(Json.convert(value));
	}
	
	@Override
	public void insert(int index, Object value) {
		entries.add(index, Json.convert(value));
	}
	
	@Override
	public Json remove(int index) {
		return entries.remove(index);
	}
	
	@Override
	public int size() {
		return entries.size();
	}
	
	@Override
	public Iterator<Json> iterator() {
		return entries.iterator();
	}
	
	@Override
	public String toString() {
		return "[array]";
	}
}
