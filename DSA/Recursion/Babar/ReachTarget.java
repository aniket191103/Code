public class ReachTarget {
    public static int Target(int arr[], int target){
         if(target==0){
            return 0;
         }
          if(target<0){
            return Integer.MAX_VALUE;
          }
          int mini= Integer.MAX_VALUE;
          for (int i = 0; i < arr.length; i++) {
          int ans=  Target(arr, target-arr[i]);
          if (ans!=Integer.MAX_VALUE) {
            
              mini = Math.min(mini, ans+1);
              // plus one kyuki ek baar call lagi target  i vlues chnge hui h  5 -1 = 4 pe call hui h;;

          }
          }
          return mini;
    }


    public static int TargetAdd(int arr[], int target, int output) {
        if (target == output) {
            return 0; // We have reached the target sum, so return 0 elements needed.
        }
        if (output > target) {
            return Integer.MAX_VALUE; // If the output exceeds the target, it's not a valid solution.
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int newOutput = output + arr[i];
            int ans = TargetAdd(arr, target, newOutput);
            System.out.println(ans);
            if (ans != Integer.MAX_VALUE) {
                min = Math.min(ans + 1, min); // Incrementing the count of elements.
            }
        }
        return min;
    }
    
    public static void main(String[] args) {
        int arr[]= {1,2,3};
        int x = TargetAdd(arr, 5,0);
        System.out.println(x);
    }
}
