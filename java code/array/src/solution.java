// // public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
//     // int m=nums1.length;
//     // int n=nums2.length;
//     // double mid=0;
//     // int k=m+n;
//     // int arr[] =new int [k];
//     // System.arraycopy(nums1, 0, arr, 0, m);
//     // System.arraycopy(nums2, 0, arr, m,n );
//     // for(int i =0;i<k;i++){
//         // System.out.println(arr[i]);
//         // for(int j=0;j<k-i-1;j++){
//             // if(arr[j]>arr[j+1]){
//                 // int temp=arr[j];
//                 // arr[j]=arr[j+1];
//                 // arr[j+1]=temp;
//                 // }

//                 // }
//                 // }
//                 // if(k%2==0){
//                     // int z = k / 2;
//                     // double e = arr[z];
//                     // double q = arr[z - 1];
//                     // mid = (e + q) / 2;

//                     // }
//                     // else
//                     // {
//                         // mid=(k+1)/2;
//                         // }

//                         // return mid;
//                         // }

//                         //     public static int searchInsert(int[] nums, int target) {
//                             //     int i, j = 0;
//                             //     for (i = 0; i <= nums.length - 1; i++) {
//                                 //         if (nums[nums.length - 1] < target) {
//                                     //             j = nums.length;
//                                     //         } else if (nums[i] == target) {
//                                         //             j = i;
//                                         //         } else if (nums[i] < target && target < nums[i + 1]) {
//                                             //             j = i + 1;
//                                             //         }

//                                             //     }
//                                             //     return j;
//                                             // }

// //    class Solution {
// // public static int maxArea(int[] height) {
// //       int n = height.length;
// //       int leftside=Integer.MIN_VALUE;
// //        int rightside=n-1;
// // int maxArea=Integer.MIN_VALUE;       
// // while(leftside<rightside){
// //     int max=Math.min( height[leftside], height[rightside]);
// // maxArea=Math.max(maxArea, max*(rightside-leftside));
// // if(height[rightside]<height[leftside])
// // {
// //     leftside++;
// // }
// // else
// // {
// //     rightside--;
// // }

// // }
// //  return maxArea;  
// //    }
// class Solution {
//     public  int[]  threeSum(int[] nums) {
//          for(int i=0;i<nums.length;i++){
//              for(int j=0;j<nums.length;j++){
//                  for(int k =0;k<nums.length;k++){
//                      if(i!=j&&i!=k&&j!=k){
//                          if(nums[i]+nums[j]+nums[k]==0){
//                              return [nums[i] ][nums[j]],[nums[k]];
//                          }
//                      }
//                  }
//              }
//          }
//     } 
// }
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Solution {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> sum = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = nums.length - 1; k > 0; k--) {
                    if (i > 0 && nums[i] == nums[i - 1]) {
                        j++;
                        k = nums.length - 1;

                    }
                    while (j < k) {
                        if (nums[j] + nums[k] + nums[i] == 0) {
                            sum.add(Arrays.asList(nums[i], nums[j], nums[k]));
                            k--;
                            j++;
                        }

                        else if (nums[j] + nums[k] + nums[i] < 0) {
                            j++;

                        } else {
                            k--;
                        }
                    }
                }
            }
        }
        return sum;
    }

    public static List<List<Integer>> threeSum2(int num1[]) {
        List<List<Integer>> sum = new ArrayList<>();

        for (int i = 0; i < num1.length; i++) {
            Arrays.sort(num1);
            int j = i + 1;
            int k = num1.length - 1;
            while (j < k) {

                if (num1[i] + num1[j] + num1[k] == 0) {
                    j++;
                    k--;
                    sum.add(Arrays.asList(num1[i], num1[j], num1[k]));

                } else if (num1[i] + num1[j] + num1[k] > 0) {
                    k--;
                } else {
                    j++;
                }
            }
        }
        return sum;
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> sum = new ArrayList<>();

        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            int l = nums.length - 2;
            while (j < k) {

                if (nums[i] + nums[j] + nums[l]+nums[k] == target) {
                    sum.add(Arrays.asList(nums[i], nums[j], nums[l], nums[k]));
                    j++;
                    k--;
                    l--;

                } else if (nums[i] + nums[j] + nums[k] + nums[l] > target) {
                    k--;
                    l--;
                } else {
                    j++;
                }
            }

        }
        return sum;
    }


    public static void pallindromes(){
        int pallindromes=0;
        int n =11;
        int temp,rem,rev;
        while(pallindromes<100){
            temp=n;
            rev=0;

            while(temp!=0){
                rem=temp%10;
                temp=temp/10;
            }
            if(rev==n){
                System.out.println(n);
                pallindromes+=1;
            }
        }

    }
    public static void main(String[] args) {
        pallindromes();
        int num1[] = { -1, 0, 1, 2, -1, -4 };
        int nums2[] = { 1, 0, -1, 0, -2, 2 };
       int  nums3[]={2,2,2,2};

        Scanner sc = new Scanner(System.in);
        // System.out.print("enter target");
        // int target = sc.nextInt();

        System.out.print(fourSum(nums2, 0));
        // System.out.print(threeSum2(num1));
        // double x= findMedianSortedArrays(num1, num2);
        // int x = searchInsert(num1, 6);
        // System.out.println(x);
        // int height[]={1,8,6,2,5,4,8,3,7};
        // int x=maxArea(height);
        // System.out.println(x);
        sc.close();
    }
}
