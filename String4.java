// Remove blank spaces from string

public class String4 {
    public static void main(String[] args) {
        String str = "    ja   va  s t a  r";

        String newstr = str.replaceAll("\\s", "");

        System.out.println(newstr);
    }
}
