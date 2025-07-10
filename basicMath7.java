//find GCD / HCF (Greatest Common Divisor / Higher Common Facter)

import java.util.Scanner;

public class basicMath7 {
    public static int find_Gcd(int n1, int n2) {
        int gcd = 0;
        for (int i = 1; i <= Math.min(n1, n2); i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number to find their GCD: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println("The GCD is : " + find_Gcd(n1, n2));
    }
}
