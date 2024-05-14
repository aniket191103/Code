public class Power {
    static int optimizedPower(int x , int n ){
        if(n==0){
            return 1;
        }
         int half = optimizedPower(x, n/2) *optimizedPower(x, n/2);
         if(n %2==0){
            return half;
         }
         else{
            return x *half;
         }
    }
    public static void main(String[] args) {
        int x = optimizedPower(10, -3);
        System.out.println(x);
    }
}
