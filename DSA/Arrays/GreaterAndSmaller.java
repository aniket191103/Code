// package Arrays;

 public class GreaterAndSmaller {
    public  static int Max(int arr[]){
        int max =arr[0];
        for (int i=1;i<arr.length;i++)
        {
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
    public static int min ( int arr[]){
        int min =arr[0];
         for (int i =0;i<arr.length;i++){
            if(min> arr[i]){
                min=arr[i];

            }
        
         }
         return min;
    }


    public static void main(String[] args) {
        int arr[]={2,3,4,6,7,8,2,98,1};
       System.out.println( "The minimum present is "+ min(arr));
       System.out.println( "The maximum present is "+ Max(arr));


    
    }
}