// palindrome

import java.util.Scanner;

public class String8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string to check palindrome:");
        String str = sc.nextLine();

        String str2 = new String();

        // reversing str and adding in str2
        for (int i = str.length() - 1; i >= 0; i--) {
            str2 = str2 + str.charAt(i);
        }

        System.out.println(str2);

        // check if str==str2
        if (str.equals(str2)) {
            System.out.println("This Strig is Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }
}
