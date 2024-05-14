public class RecArraySorrted {

    public static boolean IsSorted(int arr[],int i ){
        int n = arr.length;
        if(i==n-2){
                return true;
        }

        if(arr[i]>arr[i+1]){
            return false;
        }
        return IsSorted(arr, i+1);
    }
   public static void main(String[] args) {
    int arr[]= {10,20,30,40,50};
    System.out.println(IsSorted(arr, 0));
   } 
}
