// find the first non-repeated character

public class String12 {
    public static void findFirstNonRepeated(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (str.indexOf(ch) == str.lastIndexOf(ch)) { // lastIndexOf("") -> its gives index of last occurance
                System.out.println("The first non-repeated character is: " + ch);
                return;
            }
        }
        System.out.println("No non-repeated character found");
    }

    public static void main(String[] args) {
        String name = "srushtri";
        findFirstNonRepeated(name);
    }
}
