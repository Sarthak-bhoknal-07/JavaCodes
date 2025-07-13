// Longest Common Prefix e.g crub crush crime -> cr

import java.util.Arrays;

public class String20 {
    public static void commonPrefix(String str) {
        // Custom Delimiter (e.g., Comma, Dash)
        // splits the string str into a string[] array using comma,as the delimiter.
        String[] strArray = str.split(",");

        Arrays.sort(strArray);

        String firstWord = strArray[0];
        String lastWord = strArray[strArray.length - 1];

        StringBuilder result = new StringBuilder();
        // Compares characters one-by-one from both words until they differ
        for (int i = 0; i < firstWord.length(); i++) {
            if (firstWord.charAt(i) == lastWord.charAt(i)) {
                result.append(firstWord.charAt(i));
            } else {
                break; // break the loop -> if different character occurs
            }
        }
        System.out.println(result.toString());
    }

    public static void main(String[] args) {
        String str = "crub,crush,crime";
        commonPrefix(str);
    }
}
