import java.rmi.server.SocketSecurityException;

public class String1 {
    public static void main(String[] args) {
        // problem 1
        String sentence = "Hello <|name|>, welcome!";
        sentence = sentence.replace("<|name|>", "Sarthak");
        System.out.println(sentence);

        // problem 2 - write the program to detect double and triple spaces in a string
        String myString = "This string contain  double and   triple space";
        System.out.println("Double space occurce from index (-1 means not present): " + myString.indexOf("  "));
        System.out.println("Triple space occurce from index (-1 means not present): " + myString.indexOf("   "));
    }
}
