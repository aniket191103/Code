import java.util.*;
public  class Combination {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> res= new ArrayList<>();
        combineHlper(n,k,1,res,ans);
        return ans;
    }
    static void combineHlper(int n ,int  k , int index,List<Integer> res , List<List<Integer>> ans){
//base case
if(res.size()==k){
    ans.add(new ArrayList<Integer>(res));
    return ;
}
//Iteration
        for(int  i =index;i<=n;i++){
            if(!res.contains(i)){
                res.add(i);
            combineHlper(n, k, i, res, ans);

            //Stack Fall

            res.remove(res.size()-1);
            }
        }
    }
} 
