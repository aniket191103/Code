public class SumUptoK {
    public static boolean isSubsetPresent(int n, int k, int[] a) {
        return isSubsetPresentHelper(n, k, a, 0);
    }

    static boolean isSubsetPresentHelper(int n, int k, int[] arr, int index) {
        // If k becomes 0, it means we found a subset whose sum is k
        if (k == 0) {
            return true;
        }
        // If index exceeds array size or k becomes negative, it means no subset with sum k is possible
        if (index >= n || k < 0) {
            return false;
        }
        // Include the current element in the subset and check if a subset with sum k is possible
        boolean include = isSubsetPresentHelper(n, k - arr[index], arr, index + 1);
        // Exclude the current element from the subset and check if a subset with sum k is possible
        boolean exclude = isSubsetPresentHelper(n, k, arr, index + 1);
        // Return true if either including or excluding the current element results in a subset with sum k
        return include || exclude;
    }

    public static void main(String[] args) {
        int arr[]={22,17,19,46,48,27,22,39,20,13,18,50,36,45,4,12,23,34,24,15,42,12,4,19,48,45,13,8,38,10,24,42,30,29,17,36,41,43,39,7,41,43,15,49,47,6,41,30,21,1,7,2,44,49,30,24,35,5,7,41,17,27,32,9,45,40,27,24,38,39,19,33,30,42,34,16,40,9,5,31,28,7,24,37,22,46,25,23,21,30,28,24,48,13};
        int n=arr.length;
        int k=84;           
       System.out.println( isSubsetPresent(n, k, arr)?"yes":"No");
    }
}
