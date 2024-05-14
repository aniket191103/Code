public class Pow {
    static double myPow(int x, int n) {

        if (n == 0) {
            return 1.0;
        }
        
        double half = myPow(x, n / 2);
        if (n % 2 == 0) {
            return half * half;
        }

        else if (n<0){
            n = -n;
            return 1/myPow(x, n);
        }

        else{
            return x *half* half;
        }
    }


    public static void main(String[] args) {
        double x = myPow(10, 8);
        System.out.println(x);
    }
}
