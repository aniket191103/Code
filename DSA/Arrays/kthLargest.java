import java.util.Arrays;

public class kthLargest {

    public static int kthLargestElement(int arr[] , int k){
        int n =arr.length;
        if (n == 0 || k <= 0) return -1;
        Arrays.sort(arr);
        if(k>0 && k<n){
                return  arr[n-k];
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={3,2,1,5,6,4};
       System.out.println(

           kthLargestElement(arr, 2)
       );
    }
}
