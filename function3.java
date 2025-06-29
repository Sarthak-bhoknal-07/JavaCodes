import java.util.Scanner;
// find greater
public class function3 {
    public static void max(int a, int b) {
        if (a > b) {
            System.out.println("The greater is " + a);
        } else if (b > a) {
            System.out.println("The greater is " + b);
        } else {
            System.out.println("equal");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        max(a, b);
    }
}
