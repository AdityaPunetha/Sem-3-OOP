import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

class exp10_2 {
    public static void main(String[] args) {
        HashMap<String, String> hashmap = new HashMap<String, String>();
        hashmap.put("First", "First Inserted");
        hashmap.put("Second", "Second Inserted");
        hashmap.put("Third", "Third Inserted");
        System.out.println(hashmap);
        if (hashmap.containsKey("First")) {
            System.out.println("The hashmap contains key First");
        } else {
            System.out.println("The hashmap does not contains key First");
        }
        if (hashmap.containsKey("Fifth")) {
            System.out.println("The hashmap contains key Fifth");
        } else {
            System.out.println("The hashmap does not contains key Fifth");
        }
        if (hashmap.containsValue("First Inserted")) {
            System.out.println("The hashmap contains value First Inserted");
        } else {
            System.out.println("The hashmap does not contains value First Inserted");
        }
        if (hashmap.containsValue("Fifth Inserted")) {
            System.out.println("The hashmap contains value Fifth Inserted");
        } else {
            System.out.println("The hashmap does not contains value Fifth Inserted");
        }
        Set<String> keys = hashmap.keySet();
        for (String key : keys) {
            System.out.println(key);
        }
        Set<Entry<String, String>> entires = hashmap.entrySet();
        for (Entry<String, String> ent : entires) {
            System.out.println(ent.getKey() + " is mapped to " + ent.getValue());
        }
    }
}
