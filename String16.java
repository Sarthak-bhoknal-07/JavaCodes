// Reverse Each Word In Given String II)Without using stringbuilder 

public class String16 {
    public static void reverseEachWord(String str) {
        String[] words = str.split(" ");
        String output = "";

        for (String word : words) {
            String reversedWord = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                reversedWord = reversedWord + word.charAt(i);
            }
            output = output + reversedWord + " ";
        }
        System.out.println("O/P is: " + output);
    }

    public static void main(String[] args) {
        String str = "this is java code";
        System.out.println("OG String is: " + str);
        reverseEachWord(str);
    }
}
