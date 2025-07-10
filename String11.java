// replace character with its occurance

public class String11 {
    public static void main(String[] args) {
        String input = "opentext";
        char charToReplace = 't';

        // if charater is not present in string
        if (input.indexOf(charToReplace) == -1) {
            System.out.println("This character is not present in String");
        }

        StringBuilder sb = new StringBuilder();
        int occurance = 1;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == charToReplace) {
                sb.append(occurance); // Replace with count
                occurance++;
            } else {
                sb.append(input.charAt(i)); // Keep original
            }
        }
        System.out.println(sb.toString());
    }
}
