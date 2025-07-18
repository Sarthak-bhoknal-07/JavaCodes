import java.rmi.server.SocketSecurityException;
import java.util.Random;
import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        // 1 for rock , 2 for paper , 3 for scissors

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your input\n 1 for Rock\n 2 for Paper \n 3 for Scissors");
        int userInput = sc.nextInt();

        // Random class- part of the java.util package,used to generate random numbers
        // of different types like int, float, double, boolean, etc.
        Random random = new Random();
        int computerInput = random.nextInt(3) + 1; // correct usage: nextInt(bound) gives 0 to bound-1

        if (computerInput == 1) {
            System.out.println("Computers's Input - Rock");
        } else if (computerInput == 2) {
            System.out.println("Computers's Input - Paper");
        } else if (computerInput == 3) {
            System.out.println("Computers's Input - Scissors");
        }

        if (userInput == computerInput) {
            System.out.println("Result: Draw");
        } else if (userInput == 1 && computerInput == 3 || userInput == 2 && computerInput == 1
                || userInput == 3 && computerInput == 2) {
            System.out.println("Result: You Win");
        } else {
            System.out.println("Result: Computer Wins");
        }
    }
}
