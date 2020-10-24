# java-json
Although for many JSON libraries exist for Java none of them I found suited my
needs. Most target of serialization of Java Object's to JSON string and in
reverse. Way to static and error prone if not in supplied correctly. The ones
that do have an dynamic intermediate data structure aren't easy to use do to
the many conversions needed to turn an JSON instance into a String or Number etc.


## How to use
To create a json string just build uit a data structure ast you like, and stringify
```java
JsonArray values = new JsonArray();
values.append(12.34);
values.append(null);
values.append("asdsa");

JsonObject object = new JsonObject();
object.set("hallo", "Test");
object.set("success", true);
object.set("count", 1234);
object.set("values", values);

String json = Json.stringify(object);
System.out.println(json);
``` 
Or reading from it
```java
String jsonString = "{\"hallo\": \"Test\", \"success\": true, \"values\": [12.34, null, \"asdsa\"], \"count\": 1234}";
JSON json = Json.parse(jsonString);

String value1 = json.get("hallo").toString();
System.out.println("value of hallo: " + value1);

int index = 0;
for(JSON value : json.get("values")){
    if(value == null){
        System.out.println("value" + index + " is null");
    }else{
        System.out.println("value" + index + ": " + value);
    }
}
``` 