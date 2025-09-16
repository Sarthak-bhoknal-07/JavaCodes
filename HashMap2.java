import java.util.*;

public class HashMap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // key is Integer(ID of student) and value is String(Name)
        LinkedHashMap lmap = new LinkedHashMap<>();
        do {
            System.out.println("1. Add new element");
            System.out.println("2. Remove element");
            System.out.println("3. Search specific element");
            System.out.println("4. View all data");
            System.out.println("Enter your choice...");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the ID");
                    int id = sc.nextInt();
                    System.out.println("Enter the Name");
                    String name = sc.next();
                    lmap.put(id, name);
                    break;
                case 2:
                    System.out.println("Enter the ID");
                    int i = sc.nextInt();
                    if (lmap.containsKey(i)) {
                        lmap.remove(i);
                        System.out.println("Removed Successfully");
                    } else {
                        System.out.println("Element is not present");
                    }
                    break;
                case 3:
                    System.out.println("Enter ID to search");
                    int idd = sc.nextInt();
                    if (lmap.containsKey(idd)) {
                        System.out.println("ID is present");
                    } else {
                        System.out.println("ID is not present");
                    }
                    break;
                case 4:
                    lmap.forEach((key, value) -> System.out.println(key + " -> " + value));
                    break;

                default:
                    break;
            }
        } while (true);
    }
}
