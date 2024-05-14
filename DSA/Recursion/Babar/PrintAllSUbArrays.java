public class PrintAllSUbArrays {

    static void Print(int arr[], int start, int end){
//Base case

if(end>=arr.length ||start>=arr.length)
{
    return;
}

for (int i = start; i <=end; i++) {
    System.out.print(arr[i]+" ");
}
System.out.println();
//Recursion
if(end==arr.length-1){
    start=start+1;
    end=start-1;
}
Print(arr, start, end+1);


}

static void PrintHelper(int arr[], int start, int end){
    //Base case
    
    if(end>=arr.length ||start>=arr.length)
    {
        return;
    }
    
    for (int i = start; i <=end; i++) {
        System.out.print(arr[i]+" ");
    }
    System.out.println();

PrintHelper(arr, start, end+1);
}

//Another method
static void Print_util(int num[]){
    for (int start = 0; start < num.length; start++) {
        int end = start-1;
        PrintHelper(num, start, end);
    }
}
    public static void main(String[] args) {
        int num[]= {1,2,3,4,5};
        Print_util(num);
    }
}
