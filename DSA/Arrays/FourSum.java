import java.util.Arrays;

/**
 * FourSum
 */
public class FourSum {
static String Sum(int arr[],int n , int target){
    Arrays.sort(arr);

int sum=0;
    for (int i = 0; i < arr.length-2; i++) {
        for(int j =i+1;j<arr.length-1;j++){
            for(int k = i+2;k<n;k++){
                for(int l =arr.length-1;l>0;l--){
                    sum = arr[i]+arr[j]+arr[k]+arr[l];
                    
                }
            }
        }
        if(sum==target)return "yes";
        System.out.println(sum);
        }
    return "NO";
}
    public static void main(String[] args) {
        int arr[]={0 ,10 ,1, 1 ,2};
      String s =  Sum(arr, 5, 11);
      System.out.println(s);
    }
}