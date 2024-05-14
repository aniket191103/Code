import java.util.Arrays;

public class Recursion2 {
    public static void Print(int n ,int sum){
        while(n >0){
            sum +=n;
            Print(--n, sum);
            return;
        }
        System.out.println(sum + " ");

    }
     public static int Sum (int  n ){
         if (n ==0){
            return 0;
         }
         else{
             return  n+Sum(n-1);
         }
     }
     public static void Rev(int arr[], int n){
        while (n<0){
             return;
        }
        System.out.println(arr[n] +" ");
        Rev(arr, --n);
    
     }
     public static void UsingSwap(int arr[],int left , int right){
        if(left>=right){
            return;
        }
        else{
            swapElementsIndex(arr, left, right);
        }
     }
     public static int [] swapElementsIndex(int[] arr, int index1, int index2){
      
        // System.out.println("Before Swap - " + Arrays.toString(arr));
        if(index1<=index2){

            int temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = temp;
            
             return swapElementsIndex(arr, ++index1, --index2);
            
            
        }
        else{
            return arr;
        }
    }

 public static void main(String[] args) {
    // Print(-1, 0);


    int arr[ ]={2,3,4,5,6,7,8};
    int n = arr.length;
    // Rev(arr, n-1);
    int x[] =swapElementsIndex(arr, 0, n-1);
    for(int i =0;i<x.length;i++)
  System.out.print(
      x[i]+" "
  );  
}   
 
}
