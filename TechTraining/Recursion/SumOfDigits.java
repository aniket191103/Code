public class SumOfDigits {
    static int Sum(int n , int sum){
        while(n==0){
            return sum;
        }
        int digit =n %10;
        sum = sum+digit;
        return Sum(n/10, sum);
    }
    public static void main(String[] args) {
        int x = Sum(123456, 0);
        System.out.println(x);
    }
}
