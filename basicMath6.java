// check number is prime or not

import java.util.Scanner;

public class basicMath6 {
    public static void prime(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
                System.out.println("divisible by:" + i);
            }
        }
        if (count == 2) {
            System.out.println("Number is prime");
        } else {
            System.out.println("not prime");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to check number is prime or not: ");
        int n = sc.nextInt();
        prime(n);
    }
}
