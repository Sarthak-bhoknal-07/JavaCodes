//find the Largest Odd Number in String
// e.g 32564 -> 325
//     65247 -> 65247

import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class String19 {
    public static void LargestOddNum(String str) {
        int lastOddNumIdx = -1; // store the index of the last odd digit

        String LargestOddNumStr = new String();
        for (int i = str.length() - 1; i >= 0; i--) { // find the rightmost odd digit.
            char ch = str.charAt(i);
            // Converts the character ch to its numeric digit value by subtracting '0'
            // Example: '5' - '0' = 5, and 5 % 2 != 0 → true (odd).
            if ((ch - '0') % 2 != 0) {
                lastOddNumIdx = i;
                break;
            }
        }

        if (lastOddNumIdx == -1) {
            System.out.println("Not Odd Digit Found");
        } else {
            System.out.println(str.substring(0, lastOddNumIdx + 1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        LargestOddNum(str);
    }
}
