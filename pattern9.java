import javax.print.attribute.SetOfIntegerSyntax;

public class pattern9 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j <= 5; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            for (int l = i; l < 5; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

//      *****
//     ***** 
//    *****
//   *****
//  *****