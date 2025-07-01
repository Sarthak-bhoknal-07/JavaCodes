// Find the second largest number in array

import java.util.Scanner;

public class Array4 {
    public static void main(String[] args) {
        int[] numarr = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numarr.length; i++) {
            numarr[i] = sc.nextInt();
        }

        int largest = numarr[0];
        int sec_largest = 0;

        for (int i = 1; i < numarr.length; i++) {
            if (numarr[i] > largest) {
                sec_largest = largest;
                largest = numarr[i];
            } else if (numarr[i] < largest && numarr[i] > sec_largest) {
                sec_largest = numarr[i];
            }
        }

        System.out.println("The Second largest number is : " + sec_largest);
    }
}
