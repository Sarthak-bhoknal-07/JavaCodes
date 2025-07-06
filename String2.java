// Reverse String Using toCharArray();

import java.util.*;

public class String2 {
    public static void main(String[] args) {
        // System.out.println("Enter string to reverse:");
        // Scanner sc = new Scanner(System.in);
        // String str = sc.nextLine();
        // StringBuilder sb = new StringBuilder(str);
        // System.out.println(sb);

        // method 1 by built-in funtion
        // System.out.println("Reverse the string: " + sb.reverse());

        // method 2 by using str.toCharArray();
        String name = "This is my name";
        char[] nameChArray = name.toCharArray();

        for (int i = nameChArray.length - 1; i >= 0; i--) {
            System.out.print(nameChArray[i]);
        }

        System.out.println();

        // method 3 by using charAt()
        String str = "third method";
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }
}
