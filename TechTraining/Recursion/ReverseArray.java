public class ReverseArray {
    static int [] Replace(int arr[], int left, int right){
        if(left<=right){
          return  reverseRecurse(arr,left,right);
        }
       return arr;
    }
    static int [] reverseRecurse(int[] list, int start, int end)
{         
     if (start < end) 
     {
       int temp = list[start];
       list[start] = list[end];
       list[end] = temp;
       reverseRecurse(list, start + 1, end - 1);
    }
    return list;
}
     public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        int x []= Replace(arr, 0, arr.length-1);
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i]+" ");
        }
     }
}
