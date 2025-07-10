//remove outermost parenthesis

import java.util.Scanner;

public class String10 {
    public static void removeOutermostParenthesis(String str) {
        int counter = 0;
        String afterStr = new String();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                if (counter > 0) {
                    afterStr = afterStr + str.charAt(i);
                }
                counter++;
            } else if (str.charAt(i) == ')') {
                counter--;
                if (counter > 0) {
                    afterStr = afterStr + str.charAt(i);
                }
            }
        }
        System.out.println(afterStr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter parenthesis string: ");
        String str = sc.nextLine();
        removeOutermostParenthesis(str);

    }
}
