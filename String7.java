import java.util.Arrays;

public class String7 {
    public static void main(String[] args) {
        String str = "sarthak";

        char[] charArray = str.toCharArray();
        char temp;
        for (int i = 0; i < charArray.length; i++) {
            for (int j = i + 1; j < charArray.length; j++) {
                if (charArray[i] > charArray[j]) {
                    temp = charArray[i];
                    charArray[i] = charArray[j];
                    charArray[j] = temp;
                }
            }
        }
        System.out.println(new String(charArray));

        // new String(charArray) is used to create a String from a character array
        // char[] CharArr = { 'h', 'e', 'l', 'l', 'o' };
        // String Strr = new String(CharArr);
        // System.out.println(Strr);

        // method 2- using sort()

        String name = "This is the string";
        char[] arr = name.toCharArray();
        Arrays.sort(arr);
        System.out.println(arr);
    }
}
