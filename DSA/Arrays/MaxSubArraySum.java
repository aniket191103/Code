// package Arrays;

class MaxSubArraySum {
public static int Max(int arr[]){
    int  n =arr.length;
    int Max =Integer.MIN_VALUE;
 for (int i =0;i<n;i++){
    int sum=0;
    for(int j =i;j<n;j++){
        sum = sum+arr[j];
       Max =  Math.max(Max, sum);
    }
 }
 return Max;
}    


public static int Kedane(int arr[]){
    int n =arr.length;
    int curr_sum = 0 , max_sum = Integer.MIN_VALUE ;
    for (int i =0;i<n;i++){
        curr_sum += arr[i] ;
        if (curr_sum < 0)
        curr_sum = 0; // reset the current sum if it is negative
        else if (max_sum < curr_sum )
        max_sum = curr_sum;// keep track of maximum sum till now
        }
        return max_sum ; // add the remaining elements to get the overall maximum subarray sum
        }
public static void main(String[] args) {
    int arr[]={-1,-3,5,-4,3,-6,9,2};
 System.out.println(
     Kedane(arr)
 ); 
}
}