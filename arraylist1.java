// Arraylist methods
// list.add(element);              // adds to end
// list.add(index, element);       // adds at specific index
// list.set(index, newValue);   // Replaces the element at a specific index with a new value.

import java.util.*;

public class arraylist1 {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(1); // 1
        a1.add(2); // 1 2
        a1.add(3); // 1 2 3
        a1.add(4); // 1 2 3 4
        a1.add(5); // 1 2 3 4 5
        a1.add(0, 7); // 712345 // 7 will add at 0th index

        a1.set(0, 1); // 112345 // Replace

        for (int i = 0; i < a1.size(); i++) {
            System.out.print(a1.get(i));
            System.out.print(" ");
        }

        // for (int i : a1) {
        // System.out.println(i);
        // }
    }
}