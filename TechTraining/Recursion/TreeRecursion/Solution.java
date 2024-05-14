import java.util.* ;
public class Solution {
    public static List<List<Integer> >subsetSum(int num[]) {
        // Write your code here..
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> res= new ArrayList<>();
        subsetSumHelper(num, ans,res, 0, 0);
        return ans;
    }
static void subsetSumHelper(int arr[], List<List<Integer>> ans,List<Integer> res,int index,int sum){
if(res.size()>arr.length){
    ans.add(new ArrayList<>(res));
    return;
}
        for (int i = index; i <arr.length; i++) {
            res.add(sum +=arr[i]);
            subsetSumHelper(arr, ans, res,i, sum);
            res.remove(res.size()-1);
        }
}


    public static void main(String[] args) {
        int num[]={1,2};
        for (List<Integer> i: subsetSum(num)) {
            System.out.println(i);
        }
    }
    }

