public class Rec1 {

    public static int fibo(int n ){
         if(n ==1){
return 0;
         }
         if(n ==2){
             return 1;
         }

          int ans = fibo(n -1)+fibo(n-2);
           return ans;

    }



    public static int  fac(int n ){
        if(n ==1){
             return 1;
        }

        int ans  = n*fac(n-1);
        return ans;
    }


    public static void Print(int n){
        if (n ==0){
             return;
        }
         System.out.print(n+" ");
         Print(n-1);
    }
    public static void main(String[] args) {
        int x = fibo(8);
        System.out.println(x);
        Print(5);
        // int x = fac(5);
        // 0 1 1 2 3 5 8 13 21
    }
}
