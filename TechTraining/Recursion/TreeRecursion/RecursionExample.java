
public class RecursionExample {
    public static void main(String[] args) {
        System.out.println(sumOddDigits(123456789));
    }
    static int sumOddDigits(int n) {
        if (n == 0)
            return 0;
        int digit = n % 10;
        if (digit % 2 != 0)
            return digit + sumOddDigits(n / 10);
        return sumOddDigits(n / 10);
    }
}