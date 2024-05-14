import java.util.*;

public class CombinationTwo {
    static void findCominationSum(int arr[], int index, int target, List<Integer> ans, List<List<Integer>> res) {
        if (target == 0) {
            res.add(new ArrayList<>(ans));
            return;
        }
        for (int i = index; i < arr.length; i++) {
            if (i > index && arr[i] == arr[i - 1]) 
                continue;
            
            if (target < arr[i]) 
                break;
    

            ans.add(arr[i]);
            findCominationSum(arr, i + 1, target - arr[i], ans, res);
            ans.remove(ans.size() - 1);
        }

    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 1, 2, 2 };
        List<List<Integer>> Ans = new ArrayList<>();
        List<Integer> res = new ArrayList<>();

        findCominationSum(arr, 0, 4, res, Ans);

        for (List<Integer> integer : Ans) {
            System.out.println(integer);
        }
    }
}
