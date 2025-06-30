// Input the element of array and display array 

import java.util.*;

public class Array {
    public static void main(String[] args) {
        System.out.print("Enter the size of integer array:");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        // int[] arr - is declaration & new int[size] - is initialization and memory
        // alocation
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}