// check number is Armstrong or not
//e.g 153 = (1^3+ 5^3 +3^3) = 153 this is armstrong number 

import java.util.Scanner;

public class basicMath4 {
    public static void armstrong(int n) {
        int duplicate = n;
        int anotherduplicate = n;

        int count = 0;
        while (n > 0) {
            count++;
            n = n / 10;
        }

        int sum = 0;
        while (duplicate > 0) {
            int ld = duplicate % 10;
            sum = sum + (int) Math.pow(ld, count);
            // Math.pow(double base, double exponent)
            // But Math.pow() returns a double, so you need to cast it to int to avoidissues.
            duplicate = duplicate / 10;
        }

        if (sum == anotherduplicate) {
            System.out.println("Number is armstrong");
        } else {
            System.out.println("not armstrong");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to check armstrong or not: ");
        int n = sc.nextInt();
        armstrong(n);
    }
}
