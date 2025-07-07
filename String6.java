// remove duplicate characters in string (By using toCharArray() )

public class String6 {
    public static void main(String[] args) {
        String str = "Programming";

        char[] charArray = str.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < charArray.length; i++) {
            boolean repeated = false;
            for (int j = i + 1; j < charArray.length; j++) {
                if (charArray[i] == charArray[j]) {
                    repeated = true;
                    break;
                }
            }
            if (!repeated) {
                sb.append(charArray[i]);
            }
        }
        System.out.print(sb);
    }
}
