import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

// Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 
public class count {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int positives = 0;
        int negatives = 0;
        int zeros = 0;
        System.out.println("Press 1 to continue OR Press 0 to stop");
        int input = sc.nextInt();
        while (input == 1) {
            System.out.println("Enter number: ");
            int number = sc.nextInt();

            if (number > 0) {
                positives++;
            } else if (number < 0) {
                negatives++;
            } else {
                zeros++;
            }

            System.out.println("Press 1 to continue OR Press 0 to stop");
            input = sc.nextInt();
        }

        System.out.println("Count of positives:" + positives);
        System.out.println("Count of negatives:" + negatives);
        System.out.println("count of zeros:" + zeros);

    }
}
