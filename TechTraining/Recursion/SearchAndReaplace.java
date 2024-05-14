public class SearchAndReaplace {
    static int [] Replace(int arr[],int index,int target , int replace){
        if(index == arr.length){
            return arr;
        }
        else if (arr[index]==target){
            arr[index] = replace;
            return arr;
        } 
        if(index <arr.length)
        {
            Replace(arr, index+1, target, replace);
        }
        Replace(arr, index+1, target, replace);
       
    return arr;
    }
    public static void main(String[] args) {
        int arr[] ={10,20,30,40,50,40 ,50};
        int x []= Replace(arr, 0, 50, 500);
        for(int i =0; i <x.length;i++){
             System.out.print(x[i]+" ");
        }
    }
}
