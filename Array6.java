// check the element is in array or not  [ Linear seach ]

import java.util.Scanner;

public class Array6 {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };

        System.out.print("Enter element:");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        boolean IsInArray = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                IsInArray = true;
                break;
            }
        }
        if (IsInArray) {
            System.out.println("The element is in Array");
        }
    }
}
