public class FlyingStairs {

    public static int Stair(int n){
        if( n ==0){
             return 1;
        }
         if( n ==1)
         {

             return 1;
            }



            int ans = Stair(n-1)+Stair(n-2);
            return ans;
    }
    public static void main(String[] args) {
        int x = Stair(5);

    System.out.println( x);
    }
}
