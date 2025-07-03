public class StringMethods2 {
    public static void main(String[] args) {

        String name = "Sarthak";

        // 7- .startsWith(" ") -> return true/false depending on argument
        // 8- .endsWith(" ") -> return trur/false
        System.out.println(name.startsWith("Sart")); // o/p - true
        System.out.println(name.endsWith("Sart")); // o/p - false bcoz name string does not ends with "Sart"
        System.out.println(name.endsWith("ak")); // o/p - true

        // 9- .charAt(1) -> return character at given index
        System.out.println(name.charAt(0));

        // 10- .indexOf('s/sar') -> return the index of given string (return index of
        // first Occurance) if not found it's return -1
        System.out.println(name.indexOf('a'));
        System.out.println(name.indexOf("ar")); // return 1st index

        String modifiedName = "sarthakak";

        System.out.println(modifiedName.indexOf("ak")); // o/p is 5 bcoz of first occurance
        // .indexOF("str",n) -> its start seaching str/char from index n
        System.out.println(modifiedName.indexOf("ak", 6)); // o/p is 7 bcoz it's start seaching from index 6
        System.out.println(modifiedName.indexOf("akk", 6)); // o/p is -1 bcoz Not found

        // 11- lastIndexOf("") -> its gives index of last occurance
        System.out.println(name.lastIndexOf('a'));
        System.out.println(name.lastIndexOf('a', 6));

        // 12- name.equals("anothername") - it returns true if name string is equal to
        // passing argument(name=anothername)
        System.out.println(name.equals("Sarthak")); // return true
        System.out.println(name.equals("Sarthh")); // return false becoz declared string name=Sarthak not sarthh

        // 13- .equalsIgnoreCase("str") - return true if two string are equal ignoring
        // the case of characters
        System.out.println(name.equalsIgnoreCase("sarthak")); // o/p - true even s is lowercase
    }
}
