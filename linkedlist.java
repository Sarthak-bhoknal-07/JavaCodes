import java.util.*;

public class linkedlist {
    public static void main(String[] args) {
        // LinkedList
        List<Integer> list = new LinkedList<>();

        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);

        for (int ele : list) {
            System.out.println(ele);
        }
    }
}
