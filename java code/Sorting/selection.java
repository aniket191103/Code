package Sorting;

public class selection {
    public static void selectionSort(int arr1[]) {
        /*
         * minimum dhundho swap krdo
         * i 0- j-0
         * min =o
         * min>j;
         * j++
         * i<j
         * 
         */

        int n = arr1.length;
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i; j < n; j++) {
                if (arr1[j] < arr1[min]) {
                    min = j;
                }
            }
            int temp = arr1[min];
            arr1[min] = arr1[i];
            arr1[i] = temp;
            System.out.print(arr1[i] + " ");
        }
    }

    public static void main(String[] args) {
        // Printing the elements of the array
        int arr[] = { 13, 46, 24, 52, 20, 9, 5 };
        // selection obj=new selection();
        selectionSort(arr);
        // int storage[]=obj.selectionSort(arr);
        // for (int i = 0; i < storage.length; i++) {

        // System.out.print(storage[i] + " ");
        // }
    }
}
