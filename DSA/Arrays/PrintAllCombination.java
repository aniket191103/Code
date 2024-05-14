import java.util.Scanner;

public class PrintAllCombination {
    public static void Print(int arr[],int range,int current){
    for (int i =current;i<arr.length;i++){
        System.out.println(arr[current]+" "+arr[i]);
        if(current<range-1){
        Print(arr, range,++current);
    }
    }
    current++;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        Scanner scanner=  new Scanner(System.in);
        int current=0;
        int range= scanner.nextInt();
        if(current<range-1){

            Print(arr, 2,current);
            current++;
        }
        scanner.close();
    }
}
