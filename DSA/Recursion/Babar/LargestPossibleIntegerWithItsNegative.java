import java.util.Arrays;

public class LargestPossibleIntegerWithItsNegative {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        for (int i = nums.length - 1; i >= 0; i--) {
            int num = nums[i];
            if (Arrays.binarySearch(nums, -num) >= 0) {
                return num;
            }
        }
        return -1; // Return -1 if no such pair found
    }

    public static void main(String[] args) {
        LargestPossibleIntegerWithItsNegative solution = new LargestPossibleIntegerWithItsNegative();

        int[] nums = {-1,10,6,7,-7,1};
        int maxK = solution.findMaxK(nums);
        System.out.println("The largest possible integer with its negative is: " + maxK);
    }
}
