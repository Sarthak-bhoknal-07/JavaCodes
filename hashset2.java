// Set Operations - intersection, union, difference

import java.util.*;

public class hashset2 {
    public static void main(String[] args) {
        Set<Integer> setA = new HashSet<>();
        // putting array elements in collection
        Integer[] arr1 = { 1, 3, 2, 4, 8, 9, 0 };
        setA.addAll(Arrays.asList(arr1));

        Set<Integer> setB = new HashSet<>();
        Integer[] arr2 = { 1, 3, 7, 5, 4, 0, 7, 5 };
        setB.addAll(Arrays.asList(arr2));

        // Union
        Set<Integer> UnionSet = new HashSet<>(setA); // Copy all setA elements in unionset
        UnionSet.addAll(setB);
        System.out.println("After Union Operation - " + UnionSet);

        // Intersection
        Set<Integer> IntersectionSet = new HashSet<>(setA);
        IntersectionSet.retainAll(setB);
        System.out.println("After Intersection Operation - " + IntersectionSet);

        // Difference (setA-setB)
        Set<Integer> Difference1 = new HashSet<>(setA);
        Difference1.removeAll(setB);
        System.out.println("After Difference Operation (setA-setB) - " + Difference1);

        // Difference (setB-setA)
        Set<Integer> Difference2 = new HashSet<>(setB);
        Difference2.removeAll(setA);
        System.out.println("After Difference Operation (setB-setA) - " + Difference2);
    }
}

