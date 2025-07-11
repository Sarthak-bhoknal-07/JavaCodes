// Java Program To Find Occurrence Of Each Character II)Using HashMap\
//Hashmap stores key-value pair

import java.util.HashMap;
import java.util.Map;

public class String14 {
    public static void main(String[] args) {
        String str = "helloe";

        // Declare and Initialize HashMap
        // Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> map = new HashMap();

        char[] strArray = str.toCharArray();
        for (int i = 0; i < strArray.length; i++) {

            char ch = strArray[i];

            // map.containsKey(Object key)-Checks if the given key exists in the map.
            if (!map.containsKey(ch)) {
                map.put(ch, 1); // if key not exist in map then put occurance-1
            } else {
                // get(Object key)- Returns the value mapped to the given key.
                int value = map.get(ch); // if Exists- then value+1;
                map.put(ch, value + 1);
            }
        }
        System.out.println(map);
    }
}
