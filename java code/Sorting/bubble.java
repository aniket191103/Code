
package Sorting;
public class bubble{

    public  static int[] bubblesort(int arr[]){
int n=arr.length;
for(int i=0;i<n;i++)
{int didSwap=0;
    for(int j=0;j<n-1;j++)
if(arr[j]>arr[j+1]){
    int temp=arr[j+1];
    arr[j+1]=arr[j];
    arr[j]=temp;
didSwap=1;
}
if(didSwap==0){
    break;  
}
System.out.println("runs");
}
return arr;
    }
    public static void main(String[] args) {
        int arr[] = { 13, 46, 24, 52, 20, 9, 5 };  
        int arr1[]={2,3,4,5,6};
             int storage[]= bubblesort(arr1);
             for(int i=0;i<storage.length;i++){
                System.out.print(storage[i]+" ");;
             }
    }
}