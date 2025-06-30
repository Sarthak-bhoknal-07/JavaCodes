// Find the largest element in array

public class Array2 {
    public static void main(String[] args) {
        int[] nums = { 20, 10, 7, 98, 44, 3, 5 };

        int largest = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > largest) {
                largest = nums[i];
            }
        }

        System.out.println("The Largest element is : " + largest);

    }
}
