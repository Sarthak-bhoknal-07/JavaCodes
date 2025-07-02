//check the Array is sorted or not

public class Array8 {
    public static void main(String[] args) {
        int arr[] = { 11, 22, 45, 47, 89, 90, 99 };

        boolean IsSorted = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                IsSorted = false;
                break;
            }
        }
        if (IsSorted) {
            System.out.println("The Array is sorted");
        } else {
            System.out.println("The Array is not sorted");
        }
    }
}
