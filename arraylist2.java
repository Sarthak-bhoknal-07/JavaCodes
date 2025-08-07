import java.util.ArrayList;

public class arraylist2 {
    public static void main(String[] args) {
        ArrayList<Integer> arraylist1 = new ArrayList<>();
        arraylist1.add(10);
        arraylist1.add(20);
        arraylist1.add(30);

        ArrayList<Integer> arraylist2 = new ArrayList<>();
        arraylist2.add(7);
        arraylist2.add(17);
        arraylist2.add(27);

        arraylist1.addAll(arraylist2); // Adds second list at the add (Append)
        arraylist1.addAll(0, arraylist2); // Adds second list from 0th index, there can any specific index

        System.out.println(arraylist1.contains(7)); // gives True - it check wheather arraylist contains that perticular
                                                    // element
        System.out.println(arraylist1.containsAll(arraylist2)); // True

        // System.out.println(arraylist2.containsAll(7, 17, 27));// ❌
        // ❗Problem: containsAll() does not take multiple elements as separate
        // arguments. It takes one argument only, which should be a Collection (like
        // another list).

        arraylist1.remove(0); // its removes element of specific index 0th idx - 7 removed
        // arraylist1.clear(); // Remove all elements from the collection

        System.out.println(arraylist1.equals(arraylist2)); // false bcoz both are Not Same

        System.out.println(arraylist1.isEmpty());// false bcoz list is not empty

        arraylist1.removeAll(arraylist2);// remove all the arraylist2 elements from arraylist1

        for (int i : arraylist1) {
            System.out.print(i + " ");
        }
    }
}
