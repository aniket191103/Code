/**
 * CombinationSum
 */
import java.util.*;
public class CombinationSum {

    public static void findCominationSum(int arr[], int index , int target, List<Integer> res,List<List<Integer>> ans){
        if(index==arr.length){
            if(target==0){
                ans.add(new ArrayList<>(res));

            }
            return;
        }if(target>=arr[index]){
            res.add(arr[index]);
            findCominationSum(arr, index, target-arr[index], res, ans);
            res.remove(res.size()-1); // change the last by removing it 
        }

        findCominationSum(arr, index+1, target, res, ans);
    }
    public static void main(String[] args) {
        int arr[]={2,3,6,7};
        List<List <Integer >> Ans= new ArrayList<>();
        List<Integer> res= new ArrayList<>();

        findCominationSum(arr, 0, 7, res, Ans);

        for (List integer : Ans) {
            System.out.println(Ans);
        }
    }
}