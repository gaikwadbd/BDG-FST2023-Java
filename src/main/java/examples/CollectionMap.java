package examples;
import java.util.Map;
import java.util.HashMap;
public class CollectionMap {
    public static void main(String[] args) {
        // Creating a map using the HashMap
        Map<String, Integer> numbers = new HashMap<>();

        // Insert elements to the map
        numbers.put("Oranges", 1);
        numbers.put("Apple", 2);
        numbers.put("Grapes", 3);
        numbers.put("Banana", 4);
        System.out.println("Map: " + numbers);

        // Access keys of the map
        System.out.println("Keys: " + numbers.keySet());

        // Access values of the map
        System.out.println("Values: " + numbers.values());

        // Access entries of the map
        System.out.println("Entries: " + numbers.entrySet());

        // Remove Elements from the map
        int value = numbers.remove("Apple");
        System.out.println("Removed Value: " + value);
    }
}
