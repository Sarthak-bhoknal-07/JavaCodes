
// Sorting Arraylist
import java.util.*;

public class arraylist4 {
    public static void main(String[] args) {
        List<Integer> al1 = new ArrayList<>();
        al1.add(10);
        al1.add(7);
        al1.add(9);
        al1.add(2);
        al1.add(10);

        System.out.println("Original list " + al1);

        Collections.sort(al1);
        System.out.println("Sorted list (In ascending/natural order) " + al1);

        Collections.sort(al1, Collections.reverseOrder());
        System.out.println("Sorted list (In desending order) " + al1);

        // how to convert list to another collection for ex. hashset
        ArrayList<Integer> list = new ArrayList<>();

        HashSet<Integer> set = new HashSet<>(list);

        // Cloning & Copying
        ArrayList<Integer> cloneList = (ArrayList<Integer>) list.clone();
    }
}
