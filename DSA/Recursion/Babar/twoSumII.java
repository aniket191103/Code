public class twoSumII {
    static int[] twoSum (int arr[], int target){


        int start = 0; int end = arr.length-1;

       return SumHelper(arr, target , start , end,0);
    }
    static int[] SumHelper(int arr[], int target, int start, int end, int sum) {
        sum = arr[start]+arr[end];
        if (sum == target) {
            int res[] = new int[2];
            res[0] = start + 1;
            res[1] = end + 1;
            return res;
        }
    
        if (sum > target) {
            return SumHelper(arr, target, start, end - 1, sum); // Decrease sum by arr[end]
        }
    
        if (sum < target) {
            return SumHelper(arr, target, start + 1, end, sum ); // Increase sum by arr[start]
        }
    
        return new int[]{-1, -1}; // Return default values if no solution found
    }
    
// return [0,0];
    public static void main(String[] args) {
        int arr[]={-1,0};
        int res[]= twoSum(arr, -1);
         for (int i : res) {
            System.out.println(i);
         }
    }
}
