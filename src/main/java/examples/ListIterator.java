package examples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIterator {

    public static void main(String[] args) {
        // Create an ArrayList
        List<String> listStrings = new ArrayList<String>();
        // Add values to it
        listStrings.add("Apple");
        listStrings.add("Banana");
        listStrings.add("Oranges");

        //Create an Iterator
        Iterator<String> iterator = listStrings.iterator();
       // Use it to loop through the ArrayList
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
