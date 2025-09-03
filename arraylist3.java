// Operations in Arraylist

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class arraylist3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> al = new ArrayList<>();
        al.add(101);
        al.add(102);

        int choice;
        do {
            System.out.println("\n------ MENU ------");
            System.out.println("1. Add new element in Arraylist");
            System.out.println("2. View all element from Arraylist");
            System.out.println("3. Search specific element of Arraylist");
            System.out.println("4. View all elements in reverse direction");
            System.out.println("5. Find the index of specific element");
            System.out.println("6. Remove specific element from Arraylist");
            System.out.println("7. count the size of Arraylist");
            System.out.println("8. Quit");

            System.out.println("Enter your choice : ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter element to add in arraylist");
                    int newEle = sc.nextInt();
                    al.add(newEle);
                    break;
                case 2:
                    for (Integer ele : al) {
                        System.out.println(ele);
                    }
                    break;
                case 3:
                    System.out.println("Enter element to search: ");
                    int x = sc.nextInt();
                    if (al.contains(x)) {
                        System.out.println("The element is present");
                    } else {
                        System.out.println("Not present");
                    }
                    break;
                case 4:
                    // ListIterator<Integer> i = al.listIterator(al.size());
                    // while (i.hasPrevious()) {
                    // System.out.println(i.previous());
                    // }
                    for (int i = al.size() - 1; i >= 0; i--) {
                        System.out.println(al.get(i));
                    }
                    break;
                case 5:
                    System.out.println("Enter element to find Index: ");
                    int ele = sc.nextInt();
                    int eleIndex = al.indexOf(ele);
                    if (eleIndex != -1) {
                        System.out.println("The index of element is " + eleIndex);
                    } else {
                        System.out.println("Element Not Found");
                    }
                    break;
                case 6:
                    System.out.println("Enter element to remove: ");
                    int element = sc.nextInt();
                    if (al.contains(element)) {
                        // You should wrap the int into an Integer object:
                        al.remove(Integer.valueOf(element));
                        System.out.println("Element is removed");
                    } else {
                        System.out.println("Element not found");
                    }
                    break;
                case 7:
                    System.out.println("The size of ArrayList : " + al.size());
                    break;
                default:
                    System.out.println("Exiting Program...");
                    break;
            }
        } while (choice != 8);
    }
}
