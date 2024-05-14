// package Arrays;
import java.util.Arrays;

public class Duplicate {
    public static boolean check(int arr[])
    { 
        Arrays.sort(arr);
        for(int i =0;i<arr.length-1;i++){
            if (arr[i] == arr[i+1]){
                return true;
        }

    }
    return false;
}
public static void main(String[] args) {
    int arr[]={2,2,3};
    System.out.println("The array contains duplicate elements: "+check(arr));
}
}
