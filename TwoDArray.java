import java.util.*;

public class TwoDArray {
    public static void main(String[] args) {

        // int[][] TwoDarr;
        // TwoDarr = new int[2][3];
        // TwoDarr[0][0] = 101;
        // TwoDarr[0][1] = 102;
        // TwoDarr[0][2] = 103;
        // TwoDarr[1][0] = 201;
        // TwoDarr[1][1] = 202;
        // TwoDarr[1][2] = 203;

        // for (int i = 0; i < TwoDarr.length; i++) {
        // for (int j = 0; j < TwoDarr[i].length; j++) {
        // System.out.print(TwoDarr[i][j] + " ");
        // }
        // System.out.println();
        // }

        // Input of rows and cols of 2D array and print 2D array

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Rows of 2D array:");
        int rows = sc.nextInt();
        System.out.println("Enter the number of cols of 2D array:");
        int cols = sc.nextInt();

        int[][] flat = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                flat[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(flat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
