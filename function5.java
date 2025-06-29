import java.util.Scanner;

// function to add all odd numbers from 1 to n
public class function5 {
    public static void addOddNums(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        System.out.println("The sum is: " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n to add all odd numbers from 1 to n:");
        int n = sc.nextInt();

        addOddNums(n);
    }
}
