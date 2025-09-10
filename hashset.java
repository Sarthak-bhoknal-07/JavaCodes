import java.util.*;

public class hashset {
    public static void main(String[] args) {
        // HashSet - Does not allowed duplicate element and generate the sequence
        // randomly

        System.out.println("HashSet Elements");
        Set<Integer> hashset = new HashSet<>();
        hashset.add(1);
        hashset.add(2);
        hashset.add(2);
        hashset.add(3);
        hashset.add(4);
        hashset.add(5);

        for (int ele : hashset) {
            System.out.println(ele);
        }

        // LinkedHashSet - now allowed duplicate and geneate sequence according to user
        // sequence

        System.out.println("LinkedHashSet Element");
        Set<String> set = new LinkedHashSet<>();

        set.add("One");
        set.add("Two");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");

        for (String ele : set) {
            System.out.println(ele);
        }

        // TreeSet - not allowed duplicates and arrange all data in ascending order

        System.out.println("TreeSet elements");
        Set<Float> treeSet = new TreeSet<>();

        // Set<Float> treeSet = new TreeSet<>(Collections.reverseOrder()); // For descending

        treeSet.add(10.1f);
        treeSet.add(18.3f);
        treeSet.add(7.7f);
        treeSet.add(33.8f);
        treeSet.add(1.2f);

        for (float ele : treeSet) {
            System.out.println(ele);
        }
    }
}
