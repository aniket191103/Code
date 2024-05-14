import java.util.Arrays;

public class maxproductdiff {
    public static int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
            int product1 = nums[nums.length-1]*nums[nums.length-2];
            int product2 = nums[0]*nums[1];

            return product1-product2;
    }
    public static void main(String[] args) {
        int arr[]={5,6,2,7,4};
    int x=    maxProductDifference(arr);
    System.out.println(x);
    }
}
