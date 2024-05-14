public class insertionsort {
    public static  int[] sort(int arr[]){
for(int i=0;i<arr.length;i++){
    int prev=i-1;
    int curr=arr[i];
     while(prev>=0 && arr[prev]>curr ){
        arr[prev+1]=arr[prev];
        prev--;
    }
    arr[prev+1]=curr;


}
return arr;
    }
public static void main(String[] args) {
    int arr[]={5,4,1,3,2};
    int N = arr.length;
    // System.out.print(sort(arr));
    int storage[]=sort(arr);
    for(int i =0;i<storage.length;i++)
    System.out.print(storage[i]+"  ");

}
}
