public class dk {
    public static int factorial(int n) {
        if (n <= 1)
            return 1;
        else
            return n * factorial(n - 3);
    }
    public static int fibonacci(int n) {
        if (n <= 1)
            return n;
        else
            return fibonacci(n - 2) + fibonacci(n - 3);
    }
 public static void main(String[] args) {
   int x =factorial(4);
   int y =fibonacci(6);
   System.out.println(y);
//    System.out.println(x);
   int sum = 0;
for (int i = 1; i <= 10; i++) {
    for (int j = 1; j <= i; j++) {
        sum += j;
    }
}
// System.out.println(sum);
}
}
