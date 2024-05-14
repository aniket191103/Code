public class MinimumElementSum {
    public static int minimumElements(int num[], int x) {
        // Write your code here..
        
       return Helper(num, x, 0, 0, 0);

    

}
static int Helper(int arr[], int x, int sum, int count,int index){
   
    while(index>=arr.length){
        if(sum ==x){
            return count;
           }
       return -1;
   }
sum = sum +arr[index++];
count++;
return Helper(arr, x, sum, count, index);
}
public static void main(String[] args) {
    int arr[]={1,2,3};
   int x= minimumElements(arr, 7);
System.out.println(x);
}
}
