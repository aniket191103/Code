import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AllSequenceThatSumToK {
    public static List<List<Integer>> subarraysWithSumK(int[] a, long k) {
        List<List<Integer>> ans = new ArrayList<>();
        Set<List<Integer>> visited = new HashSet<>();
        subarraysWithSumKHelper(a, k, new ArrayList<>(), 0, ans, visited);
        return ans;
    }

    static void subarraysWithSumKHelper(int[] arr, long k, List<Integer> currentList, int index, List<List<Integer>> ans, Set<List<Integer>> visited) {
        if (index >= arr.length) {
            // Check if the currentList sums up to k and is not already visited
            long sum = 0;
            for (int num : currentList) {
                sum += num;
            }
            if (sum == k && !visited.contains(currentList)) {
                ans.add(new ArrayList<>(currentList));
                visited.add(new ArrayList<>(currentList)); // Mark currentList as visited
            }
            return;
        }

        // Include arr[index] in the currentList
        currentList.add(arr[index]);
        subarraysWithSumKHelper(arr, k, currentList, index + 1, ans, visited);

        // Exclude arr[index] from the currentList
        currentList.remove(currentList.size() - 1);
        subarraysWithSumKHelper(arr, k, currentList, index + 1, ans, visited);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1, 1};
        long k = 3;
        List<List<Integer>> result = subarraysWithSumK(arr, k);
        System.out.println("Subarrays with sum " + k + ": " + result);
    }
}
