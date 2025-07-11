
// Java Program To Find Occurrence Of Each Character I)Using nested loop (Two pointer approach)

public class String13 {
    public static void main(String[] args) {
        String str = "hello";
        char[] strArray = str.toCharArray();

        for (int i = 0; i < strArray.length; i++) {

            if (strArray[i] == 0) {
                continue; // already counted / visited
            }

            int count = 1;
            for (int j = i + 1; j < strArray.length; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                    strArray[j] = 0; // mark as visited
                }
            }
            System.out.println(strArray[i] + " - " + count);
        }
    }
}

// Output
// h - 1
// e - 1
// l - 2
// o - 1