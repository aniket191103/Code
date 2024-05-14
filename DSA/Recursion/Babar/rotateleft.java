public class rotateleft {
    static int[] rotate(int arr[],int k){
        while (k==0) {
            return arr;
        }
            int temp = arr[0];
    
            for(int i =0;i<arr.length-1;i++){
                arr[i]=arr[i+1];
            }
            arr[arr.length-1]=temp;
    
            return rotate(arr, k-1);
    }
    public static void main(String[] args) {
        int arr[]={ 2, 13, 3, 11, 5, 17, 7 };
      int res[]=  rotate(arr, 2);
      for (int i = 0; i < res.length; i++) {
        System.out.print(res[i]+" ");
      }
    }
}
