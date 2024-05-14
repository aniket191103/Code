import java.util.Arrays;

public class ConstructTriangle {
    public static void printTriangle(int[] A)
    {
        // Base case
        if (A.length < 1)
            return;
   
        // Creating new array which contains the
        // Sum of consecutive elements in
        // the array passes as parameter.
        int[] temp = new int[A.length - 1];
        for (int i = 0; i < A.length - 1; i++)
        {
            int x = A[i] + A[i + 1];
            temp[i] = x;
            // System.out.print(x+" ");
            
        }
        printTriangle(temp);
        System.out.println(Arrays.toString(A));
   
        
    }
    public static void main(String[] args) {
        int arr[]={1, 2, 3, 4, 5 };
        printTriangle(arr);
    }
}