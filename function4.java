import java.util.Scanner;

// Finding factorial e.g 3!= 3*2*1

public class function4 {
    public static void printFactorial(int x) {
        if (x < 0) {
            System.out.println("Invalid Input");
            return;
        }
        int factorial = 1;
        for (int i = x; i >= 1; i--) {
            factorial = factorial * i;
        }
        System.out.println("The factorial of " + x + " is " + factorial);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        printFactorial(x);
    }
}
