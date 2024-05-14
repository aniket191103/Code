

public class Rotateleft {
static int[] rotate(int arr[],int k){
    while (k==0) {
        return arr;
    }
        int temp = arr[1];

        for(int i =1;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=temp;

        return rotate(arr, k-1);
}
 public static void main(String[] args) {
    int  arr[]={1,2,3,4,5};
int x []= rotate(arr,1);
for (int i = 0; i < x.length; i++) {
    System.out.print(x[i]+" ");
}
 }   
}