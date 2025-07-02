// Write code to reverse the array Using while Loop

public class Array7 {
    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };

        // Using 2 pointer approch
        int left = 0;
        int right = arr.length - 1;

        System.out.println("The Original array is: ");
        display(arr);

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        System.out.println("The array after reverse:");
        display(arr);
    }
}
