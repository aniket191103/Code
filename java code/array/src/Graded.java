public class Graded{
    // function for printing the Array
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
    }
    // function for counting sort
    public static void countSort(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest=Math.max(largest, arr[i]);
        }
        // make the counting array
        int count[]=new int[largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        // sorting 
        int j=0;
       
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                // decrease the frequency
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[]={0, 0,1,1,5,5,6,1,5,6,8};
        System.out.println("Before Sorting-->");
        printArray(arr);
        System.out.println();
        System.out.println("After Sorting-->");
        countSort(arr);
        printArray(arr);
        
    }
}

