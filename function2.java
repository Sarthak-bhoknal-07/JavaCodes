import java.util.Scanner;
// multiply function 
public class function2 {
    public static int calculateProduct(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println("The answer is: " + calculateProduct(x, y));
    }
}
