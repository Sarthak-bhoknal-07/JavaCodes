// count the digits of number

import java.util.Scanner;

public class basicMath {
    public static int count(int n) {
        int count = 0;
        while (n > 0) {
            // int lastdigit = n % 10;
            // System.out.print(lastdigit + " ");
            count++;
            n = n / 10; // ex- 768/10 = 76.8 = 76
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The count of digits = " + count(n));
    }
}
