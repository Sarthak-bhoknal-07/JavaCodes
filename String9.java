//Valid Parenthesis (Using maintaining counter - only applicable for '( )'this type of parenthese)
// for [] {} other type of parenthesis - use stack method

import java.util.Scanner;

public class String9 {
    public static void checkValidParanthesis(String str) {
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                counter++;
            } else if (str.charAt(i) == ')') {
                counter--;
                if (counter < 0) {
                    System.out.println("not valid parenthesis");
                    break;
                }
            }
        }
        if (counter == 0) {
            System.out.println("valid parenthesis");
        } else {
            System.out.println("not valid parenthesis");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        checkValidParanthesis(str);
    }
}