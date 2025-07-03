public class StringMethods1 {
    public static void main(String[] args) {
        // String name = new String("Sarthak");

        String name = "Sarthak";

        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();

        System.out.println(name);

        // String methods
        System.out.println("The length of String is:" + name.length()); // 1- .length()

        String Lstr = name.toLowerCase(); // 2- .toLowerCase()
        System.out.println("Convert into lower case: " + Lstr);

        String Ustr = name.toUpperCase(); // 3- .toUpperCase()
        System.out.println("Convert into upper case: " + Ustr);

        // System.out.println(name.toUpperCase());

        // 4- .trim() -> Remove leading and trailing spaces from the string
        String nonTrimedString = "  sarthak bhoknal   ";
        System.out.println(nonTrimedString);
        String trimedString = nonTrimedString.trim();
        System.out.println(trimedString);

        // 4- .subString(int start) -> start is the begin index, it return substring
        // from start index to end
        System.out.println(name.substring(3));

        // 5- .subString(int start, int end) -> start is included, end is excluded
        System.out.println(name.substring(1, 5)); // not printing 5th index char

        // 6- .replace('oldchar','newchar') -> it replace oldchar with newchar
        System.out.println(name.replace('S', 'k'));

        System.out.println(name.replace("thak", "thya"));
    }
}
