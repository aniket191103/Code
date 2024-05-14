import java.util.ArrayList;
import java.util.List;

public class SequenceRecur {
    static void Sequence(int arr[], int index, List<Integer> res){
        if(index == arr.length){
            Print(res);
            return;
        }
        
        res.add(arr[index]);
        Sequence(arr, index + 1, res);
        res.remove(res.size() - 1); 
        Sequence(arr, index + 1, res);
    }

    static void Print(List<Integer> res){
        for (int i = 0; i < res.size(); i++) {
            System.out.print(res.get(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {3, 2, 1};
        List<Integer> res = new ArrayList<>();

        Sequence(arr, 0, res);
    }
}
