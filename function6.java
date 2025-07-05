import java.util.*;

public class function6 {
    public static void Isprime(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("This is the prime number");
        } else {
            System.out.println("This is not prime number");
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter number to check prime or not:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Isprime(n);
    }
}
