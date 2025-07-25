import java.util.Arrays;
import java.util.Scanner;

public class sorting2 {
    public static void bubbleSort(int[] nums) {
        int n = nums.length;
        for (int i = n - 1; i >= 1; i--) {
            boolean isSwap = false; // flag to check for swaps
            for (int j = 0; j < i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    isSwap = true; // mark that a swap happened
                }
            }
            if (isSwap == false) { // exit early if no swaps
                break;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int[] nums = new int[size];
        System.out.println("Enter numbers to sort using bubble sort:");
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }
        bubbleSort(nums);
    }
}
