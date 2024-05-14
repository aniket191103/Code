
import java.util.*; 
public class Intersection {

        public void intersection(int[] nums1, int[] nums2) {
            int n = nums1.length;
            int m = nums2.length;
           HashSet<Integer> res = new HashSet<>();
    
    
            for(int i =0;i<n;i++){
                for(int j =0;j<m;j++){
                    if(nums1[i]== nums2[j]){ 
                        res.add(nums1[i]);
                    }
                    else {
                         continue;
                    }
                }
            }
        System.out.print(res);
        }
        public static void main(String[] args) {
            Intersection obj=new Intersection();
            int [] arr1={4,9,5};
            int [] arr2={7,9,8};
            obj.intersection(arr1,arr2);
        }
    }