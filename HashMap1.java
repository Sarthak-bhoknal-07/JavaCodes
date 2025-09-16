import java.util.*;

public class HashMap1 {
    public static void main(String[] args) {
        // HashMap hmap = new HashMap();
        Map<Integer, String> hmap = new HashMap<>();

        hmap.put(1, "Ram");
        hmap.put(2, "Sham");
        hmap.put(3, "Ghansham");
        hmap.put(3, "Ghansham");
        hmap.put(4, "Dinesh");
        hmap.put(5, "Ramesh");

        // Printing the Whole Map Directly(in single-line)
        System.out.println(hmap);

        System.out.println();

        // Using entrySet() with Enhanced For Loop
        // entrySet() method returns a set of key-value pairs (called Map.Entry).
        for (Map.Entry<Integer, String> ele : hmap.entrySet()) {
            System.out.println(ele.getKey() + " -> " + ele.getValue());
        }

        System.out.println();

        // Using forEach() Method (Java 8+)
        hmap.forEach((key, value) -> System.out.println(key + " -> " + value));

        System.out.println();

        // Using keySet() to Print Keys, then Get Values
        // keySet() returns a set of all keys, then we can get each value using
        // mapref.get(key).
        for (Integer key : hmap.keySet()) {
            System.out.println(key + " -> " + hmap.get(key));
        }

    }
}
