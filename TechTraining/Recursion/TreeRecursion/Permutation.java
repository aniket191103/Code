import java.util.ArrayList;
import java.util.List;

public class Permutation {
    static List<List<Integer>> perm(int arr[]){
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer>  res= new ArrayList<>();

        permuteHelper(arr,res,ans);

        return ans;


    }

    static void permuteHelper(int arr[], List<Integer> res, List<List<Integer>> ans){

if(res.size()==arr.length){
    ans.add(new ArrayList<>(res));
    return;
}

    for (int i = 0; i < arr.length; i++) {
        if(!res.contains(arr[i])){
            res.add(arr[i]); 
            permuteHelper(arr,  res, ans);
            res.remove(res.size()-1);
        }
    }
}


public static void main(String[] args) {
    int arr[]={1,2,3};
    // perm(arr);
    for (List<Integer> I : perm(arr)) {
        System.out.println(I);
    }
}
}

