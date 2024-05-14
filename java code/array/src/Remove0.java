
public class Remove0 {
    public static int[] ZeroAtLast(int arr[]){
       int n= arr.length;
       int count=0;
       for(int i =0;i<n;i++){
        if(arr[i]!=0){
            arr[count]=arr[i];
            count++;
            
        }
       }
       for(int i =count;i<n;i++){
        arr[i]=0;
       }

        return arr;
    }

public static int [] Optimal(int arr1[]) {

    int n =arr1.length;
    int count=0;
    for(int i =0;i<n;i++){
        
        if(arr1[i]!=0){
        int temp = arr1[count];
        arr1[count] = arr1[i];
        arr1[i] = temp;
        count++;
        }
    }
     return arr1;
}
    public static void main(String[] args) {
        int nums[]={1,0,2,0,3,0,4,5,0,6,0};
        int[] storage = Optimal(nums);
 
        // Printing the elements of the array
        for (int i = 0; i < storage.length; i++){

        

            System.out.print(storage[i] + " ");
        }

    }
}
