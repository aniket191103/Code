/**
 * ArratIsSorted
 */
public class ArratIsSorted {
 static boolean IsSorted(int arr[], int index){
    if(index>=arr.length-1)
{
    return true;
}
if(arr[index]<=arr[index+1]){
    return IsSorted(arr, index+1);
}
    return false;
}
    public static void main(String[] args) {
        int arr[ ]={1,1,3,4,5};
      boolean x =  IsSorted(arr, 0);
      System.out.println(x);
    }
}