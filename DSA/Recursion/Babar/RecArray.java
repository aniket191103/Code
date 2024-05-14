public class RecArray {


    public static void Print(int arr[], int n , int index){
         if(index>=n){
            return;
         }

         Print(arr, n, index+1);
         System.out.println(arr[index]);
    }

    public static int Max (int arr [],int index ,int max ){
         if (index >= arr.length){
             return max;
         }
         if(arr[index]>max){
             max = arr[index];
         }
         return Max(arr, index+1, max);
    }

    public static void Digit (int num){
        if(num<=0){
            return ;
        }
        int digit = num %10;
        Digit(num/10);
        System.out.print(digit);
            

    }
 public static void main(String[] args) {
    Digit(123);
//     int arr []={10,20,30,4550,50};
//      int n = arr.length;
//     Print(arr, n, 0);
// int max = Integer.MIN_VALUE;
//     int x = Max(arr, 0, max);
//     System.out.println(x);
 }   
}
