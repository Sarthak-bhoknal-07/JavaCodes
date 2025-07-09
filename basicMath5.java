// print all divisors
// e.g 36 - 1,2,3,4,6,9,12,18,36

import java.util.Scanner;

public class basicMath5 {
    public static void divisors(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to get their divisors: ");
        int n = sc.nextInt();
        divisors(n);
    }
}
