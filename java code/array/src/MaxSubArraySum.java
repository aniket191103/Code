public class MaxSubArraySum {

public static void kadane(int numbers[]) {
    int ms=Integer.MIN_VALUE;
    int cs=0;
    for(int i=0;i<numbers.length;i++){
        cs=cs+numbers[i];
if(cs<0){
    cs=0;
}
ms=Math.max(cs, ms);

    }
    // System.out.println(" the max is "+ms);
}
public static void kadaneALLnegative(int numbers2[]) {
    int cs=0;
    int ms=Integer.MIN_VALUE;
    for(int i=0;i<numbers2.length;i++){
cs+=numbers2[i];
if(cs<ms){
    ms=cs;
}
}
System.out.print(Math.max(cs, ms));
 
    
    }
        public static void main(String argS[]){
            int arr[]={2,4,6,8,10};
            int arr1[]={-2,-3,4,-1,-2,1,5,-3};
            int arr2[]={-8,-2,-3,-1};
            kadaneALLnegative(arr2);
            kadane(arr1);
        int MaxSum=Integer.MIN_VALUE;
        int CurrentSum=0;
        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<prefix.length;i++)
        {
             prefix[i]=prefix[i-1]+arr[i];
            //  System.out.println(prefix[i]);
        }

        for(int i =0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end =j;
                CurrentSum=0;
               if(start==0){
               CurrentSum= prefix[end];
               }
               else{
                CurrentSum=prefix[end]-prefix[start-1];
               }
//                 for(int k=start;k<=end;k++){
//                     CurrentSum+=arr[k];
// // System.out.print(arr[k]+" ");high time compllexity so new emthod
// }

// System.out.print(CurrentSum +"  ");
if(MaxSum<CurrentSum){
    MaxSum=CurrentSum;
}
}
}
// System.out.println( "The maxsum is"+MaxSum);

    }
}
