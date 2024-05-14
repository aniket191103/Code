public class Quest1 {
    static int fibo(int n){
        if(n ==1){
            return 1;
        }
        if(n==0){
            return 0;
        }

        return fibo(n-1)+fibo(n-2);
    }
    public static void main(String[] args) {
        int x = fibo(6);
        System.out.println(x);
    }
}
