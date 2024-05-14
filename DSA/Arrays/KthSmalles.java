import java.util.Arrays;
import java.util.Scanner;

public class KthSmalles {
    public static int Small(int arr[],int k){
        int result=0;
        int n =arr.length;
        Arrays.sort(arr);
        for(int i =0;i<n;i++){
         result = arr[k-1];
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[]=new int[]{7,3,4,10,20,15};
        int arr2[]={1,2,3,4,5,6,7,8,9,10};
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter Values of k");
        int k = scanner.nextInt();
        System.out.println(Small(arr, k));
        scanner.close();
    }
}
