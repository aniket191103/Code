import java.util.*;
public class SubArrayWithSm{
    public static  List<List < Integer > > subarraysWithSumK(int []a, long k) {
        // Write your code here
        ArrayList<List<Integer> > ans = new ArrayList<List<Integer> >(); 


        Helper(a, 0, 0, k,ans);
    return ans;
    }


    static void Helper(int [] a, int sum ,int i,long target,List<List<Integer>>ans){
        List<Integer> res= new ArrayList<Integer>();
        if(i<=a.length){
            return;
        }
        sum = sum +a[i];

        Helper(a, sum, i+1, target, ans);


        if(sum==target){
            res.add(i);
        }
    }
    public static void main(String[] args) {
        
        int arr[]={1, 2, 3, 1, 1, 1};

    }
}