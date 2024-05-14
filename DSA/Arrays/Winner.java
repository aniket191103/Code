public class Winner{

static int getWinner(int []arr, int k ){
    return Winner1(arr, k, 0);
}

        public static int Winner1(int[] arr, int k, int wincount) {

        
            if(wincount>=2 ){
                return -1;
            }
                if(arr[0]>arr[1]){
                    // wincount++;
                   int res[]= rotate(arr,1);
                    Winner1(res, k, wincount+1);
                    if(wincount==2){
                        return res[0];
                    }
            }
            else if (arr[0]<arr[1]){
              int res[]=  rotateF(arr,1);
                Winner1(res , k,wincount);
                if(wincount==2){
                    return res[0];
                }
            }
        return arr[0];
        }
        static int[] rotate(int arr[],int k){
        while (k==0) {
            return arr;
        }
            int temp = arr[1];
    
            for(int i =1;i<arr.length-1;i++){
                arr[i]=arr[i+1];
            }
            arr[arr.length-1]=temp;
    
            return rotate(arr, k-1);
    }
    static int[] rotateF(int arr[],int k){
        while (k==0) {
            return arr;
        }
            int temp = arr[0];
    
            for(int i =0;i<arr.length-1;i++){
                arr[i]=arr[i+1];
            }
            arr[arr.length-1]=temp;
    
            return rotateF(arr, k-1);
    }
    public static void main(String[] args) {
        int arr [] ={1,25,35,42,68,70};
   int res= getWinner(arr, 1);
   System.out.println(res);
    }
}
