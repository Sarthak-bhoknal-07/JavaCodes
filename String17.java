// remove while spaces without using .replaceAll("\\s"," ");

public class String17 {
    public static void main(String[] args) {
        String str = "ja  va  c o d e";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                continue;
            }
            sb.append(str.charAt(i));
        }
        System.out.println(sb);
    }
}
