// reverse the number  eg= 768900 -> 9867

import java.util.Scanner;

public class basicMath2 {
    public static int reverse(int n) {
        int rev = 0;
        while (n > 0) {
            int lastdigit = n % 10;
            n = n / 10;
            rev = (rev * 10) + lastdigit;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to reverse:");
        int n = sc.nextInt();
        System.out.println("The reversed number is: " + reverse(n));
    }
}
