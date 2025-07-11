// Reverse Each Word In Given String I) Using StringBuilder

public class String15 {
    public static void reverseEachWord(String statement) {
        String[] words = statement.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            // Reverse each word and append to result
            result.append(new StringBuilder(word).reverse()).append(" ");
        }

        // Remove last space and print
        System.out.println(result.toString().trim());
    }

    public static void main(String[] args) {
        String statement = "My name is Sarthak";
        reverseEachWord(statement);
    }
}
