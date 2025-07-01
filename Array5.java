public class Array5 {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 3, 67, 1, 45, 2, 78 };

        int smallest = arr[0];
        int sec_smallest = -1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                sec_smallest = smallest;
                smallest = arr[i];
            } else if (arr[i] > smallest && arr[i] < sec_smallest) {
                sec_smallest = arr[i];
            }
        }
        System.out.println("The second smallest is : " + sec_smallest);
    }
}
