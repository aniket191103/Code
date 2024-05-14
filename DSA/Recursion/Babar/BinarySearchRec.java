
public class BinarySearchRec {
    public static int Search(int arr[],int  key, int low, int high  ){
      int  mid = (low +high)/2;
if(low >high){
    return -1;
}
        if(arr[mid]==key){
             return mid;
        }
        else if(arr[mid]>key){
             return Search(arr, key, low, mid-1);
        }
        else{
            return Search(arr, key, mid+1, high);
        }
    }
    public static void main(String[] args) {
        int arr []={ 10,20,30,40,50};
         int key =50;
         int high = arr.length-1;
         int x = Search(arr, key, 0, high);
         System.out.println(x);
    }
}
