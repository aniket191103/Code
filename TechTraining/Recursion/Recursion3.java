public class Recursion3 {

    static int[] CountEvenOdd(int n) {
        if (n == 0) {
            int arr[] = new int[2];
            return arr;
        }
        int arr[] = CountEvenOdd(n - 1);
        if (n % 2 == 0) {
            arr[0] = arr[0] + 1;

        } else {
            arr[1] = arr[1] + 1;
        }
        return arr;
    }

    // even and odd Sum
    public static void CountEvenOdd(int n, int even, int odd) {
        while (n == 0) {
            System.out.print("Even " + even + " odd   " + odd);
            return;
        }
        if (n % 2 == 0) {
            even++;
        } else {
            odd++;
        }
        CountEvenOdd(n - 1, even, odd);
    }

    public static void main(String[] args) {
        int n = 10;
        int[] res = CountEvenOdd(n);
        System.out.println("Number of Even numbers are : " + res[0]);
        System.out.println("Number of Odd numbers are : " + res[1]);

    }
}