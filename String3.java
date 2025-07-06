// Remove special characters from string

public class String3 {
    public static void main(String[] args) {
        String str = "$java%#@st!ar";

        // method 1 - using built-in function .replace()
        System.out.println(str.replaceAll("[^a-zA-Z0-9]", ""));
    }
}
