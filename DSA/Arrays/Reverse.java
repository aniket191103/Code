// package Arrays;
public class Reverse {
    public static int[] Rev(int arr[]){
        int arr2[] =new int[arr.length];
        int j=0;
    for(int i =arr.length-1;i>=0;i--){

        arr2[j]=arr[i];
        j++;
    }

return arr2;
}
 public static void main(String[] args) {
    int arr[]={1,2,3,5,6};
    for(int i =0;i<arr.length;i++){

        System.out.print(arr[i]);
    }
  
        int arr2[]=Rev(arr);
        System.out.println("Reversed Arrays");
        for(int i =0;i<arr2.length;i++){
            System.out.print( arr2[i]) ;
        }
    
    }
 }   
