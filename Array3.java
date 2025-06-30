// Find the Smallest element in array

import java.util.Scanner;

public class Array3 {

    public static int smallest(int[] num) {
        int smallest = num[0];
        for (int i = 1; i < num.length; i++) {
            if (num[i] < smallest) {
                smallest = num[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        System.out.println("Enter the Numbers [Size is 5]:");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The smallest number is:" + smallest(arr));
    }
}
