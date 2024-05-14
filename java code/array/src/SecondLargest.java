 import java.lang.reflect.Array;
import java.util.Arrays;
public class SecondLargest {
     public  static int Second( int arr[]){
        int largest=Integer.MIN_VALUE;
    //   int num[] = new int [arr.length];

    Arrays.sort(arr);
    if(arr[arr.length-2]!=arr[arr.length-1]){
        
        if(arr[arr.length-2]<arr[arr.length-1]){
            largest=arr[arr.length-2];
        }
    } 
    // else()
for(int i=1;i<arr.length;i++){
if(arr[arr.length-i]==arr[arr.length-(i+1)] && arr[arr.length-(i+1)]>arr[arr.length-(i+2)]){
        largest=arr[arr.length-(i+2)];
    }
}
    return largest;
}


public static int Optimal(int arr1[]){
    Arrays.sort(arr1);
    int largest=arr1[0];
    int SecondLargest=Integer.MIN_VALUE;
    for(int i=1;i<arr1.length;i++){
        if(arr1[i]>largest){
            SecondLargest=largest;
            largest=arr1[i];
        }
    }
return SecondLargest;
}

public static int Ssmallest( int arr2[]){
        Arrays.sort(arr2);

    int second=Integer.MAX_VALUE;
    int smallest=arr2[0];
for(int i =1;i<arr2.length;i++){

    if(second>arr2[i] && smallest!=arr2[1]){
        smallest=second;
        second=arr2[i];
    }
    else if (smallest ==arr2[i]){
        second=arr2[arr2.length-(i+2)];

    }
}
return second;
}



public static int[] duplicate (int num[]){
            Arrays.sort(num);

    int nums1[]= new int [num.length];

    for(int i =0;i<num.length-1;i++){
        if(num[i]!= num[i+1]){
nums1[i]=num[i];

        }
   
    }
    return nums1;
}


public static int[] leftrotate( int arr[]){
    int temp= arr[0];
    for(int i =1;i<arr.length;i++){
        arr[i-1]=arr[i];
        
    }
    arr[arr.length-1]=temp;
    return arr;
}

public static int[] Drotate(int arr[],int d){
    int n=arr.length;
    d=d%n;
    int temp[] =new int[d];
    for(int i=0;i<d;i++){

    temp[i]=arr[i];
    }
for(int i=d;i<n;i++){
    arr[i-d]=arr[i];
}
for(int i =n-d;i<n;i++){
    arr[i]=temp[i-(n-d)];
}
return arr;
}

     public static void main(String[] args) {
        int nums[]={1,1,1,1,1,1,0,8,5,2,5,2,6,8};
int arr1[]= {1,2,3,4,5};
// System.out.println(Ssmallest(nums));
// System.out.println(duplicate(arr));
// System.out.println(leftrotate(arr1));
int[] storage = Drotate(arr1, 35);
 
        // Printing the elements of the array
        for (int i = 0; i < storage.length; i++){

        

            System.out.print(storage[i] + " ");
        }

}
}

