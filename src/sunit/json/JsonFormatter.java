package sunit.json;

public class JsonFormatter {
	public void toJson(StringBuilder builder, Json value) {
		if (value == null) {
			builder.append("null");
			return;
		}
		
		switch (value.getType()) {
			case Boolean:
				builder.append(value.toString());
			break;
			case Number:
				builder.append(value.toNumber());
			break;
			case String:
				append(builder, value.toString());
			break;
			case Array:
				builder.append('[');
				
				if (value.size() > 0) {
					toJson(builder, value.get(0));
					
					for (int index = 1; index < value.size(); index++) {
						builder.append(", ");
						toJson(builder, value.get(index));
					}
				}
				builder.append(']');
			break;
			case Object:
				builder.append('{');
				String[] keys = value.keys();
				if (keys.length > 0) {
					append(builder, keys[0]);
					builder.append(": ");
					toJson(builder, value.get(keys[0]));
					
					for (int index = 1; index < keys.length; index++) {
						builder.append(", ");
						append(builder, keys[index]);
						builder.append(": ");
						toJson(builder, value.get(keys[index]));
					}
				}
				builder.append('}');
			break;
		}
	}
	
	private void append(StringBuilder builder, String string) {
		builder.append("\"");
		for (char value : string.toCharArray()) {
			if (value == '"') {
				builder.append("\\\"");
			} else if (value == 8) {
				builder.append("\\b");
			} else if (value == 9) {
				builder.append("\\t");
			} else if (value == 10) {
				builder.append("\\n");
			} else if (value == 12) {
				builder.append("\\f");
			} else if (value == 13) {
				builder.append("\\r");
			} else if (value == '"') {
				builder.append("\\\"");
			} else {
				builder.append(value);
			}
		}
		builder.append("\"");
	}
}
