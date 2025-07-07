// remove duplicate characters in string (By using indexOf("ch",index))

public class String5 {
    public static void main(String[] args) {
        String name = "Programming";

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            int idx = name.indexOf(ch, i + 1); // start searching / return the index of "ch" from index i+1 if found
                                               // then it is repeated if not found then not repeated o/p is -1
            if (idx == -1) {
                sb.append(ch);
            }
        }
        System.out.print(sb);
    }
}
