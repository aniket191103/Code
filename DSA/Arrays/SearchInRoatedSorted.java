public class SearchInRoatedSorted {
        public static int search(int[] nums, int target) {
             int low =0;
             int high=nums.length-1;
             while(low<=high){
                 int mid=(low+high)/2;
                 if(nums[mid]==target){
                     return mid;
                 }
                 if(nums[low]<=nums[mid]){
                     if(nums[low]<=target&& nums[mid]>=target){
                         // left hand side pe hi target h mera
                        high=mid-1;
    
                     }
                     else{
                            low=mid+1;
                     }
             }
                     else if(nums[high]>=nums[mid]){
                     if(nums[high]>=target&& nums[mid]<=target){
                         low=mid+1;
    
                     }
                     else {
                         high=mid+-1;
                     }
                 }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr={4,5,6,7,0,1,2};
        System.out.println(SearchInRoatedSorted.search(arr, 0));
    }
    }

