public class MaxSumOfAdjacent {
    static void solve(int arr[], int i, int sum, int[] maxi) {
        if (i >= arr.length) {
            maxi[0] = Math.max(sum, maxi[0]);
            return;
        }
        // include
        solve(arr, i + 2, sum + arr[i], maxi);

        // exclude
        solve(arr, i + 1, sum, maxi);
    }

    public static void main(String[] args) {
        int[] maxi = { Integer.MIN_VALUE };
        int arr[] = { 2, 1, 4, 9 };
        solve(arr, 0, 0, maxi);
        System.out.println("Maximum sum of non-adjacent elements: " + maxi[0]);
    }
}
