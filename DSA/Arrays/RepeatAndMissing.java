import java.util.*;
// List<Integer> l=new ArrayList<>();
// List<List<Integer>> x=new ArrayList<>();
public class RepeatAndMissing {
    public static int Repeat(int arr[]) {
        HashSet<Integer> hs=new HashSet<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if(hs.contains(arr[i])){
                return arr[i];
            }
            hs.add(arr[i]);
        }
        return -1;
    }

    public static int Missing(int arr[]) {
        int repeat = Repeat(arr);
        int n = arr.length;
        int maxSum = (n * (n + 1)) / 2;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        if (maxSum == sum) {
    
            return 0;
        } else if (maxSum > sum) {
            return (maxSum - sum)+repeat ;
        }
        else if (maxSum<sum){
            return  repeat-(sum-maxSum);
        }
        return 0;
    }

    public static void main(String[] args) {
        int arr[] = {3, 1, 9,5, 4,6,8,7,9,10 };

        System.out.println(
                "Repeating element is : " + Repeat(arr) + "\n" + "The missing number is: " + Missing(arr));

    }
}
