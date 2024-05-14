public class Recursion1 {

    static void show(int n) {
        if (n > 0) {

            System.out.println("Ani");
            show(n - 1); // Functionn calls itself (Cycle)
            // System.out.print(n);
        }
        // been called by tail is known as tailrecussrion
    }
    static int sum(int n)
    {
        if (n == 0){
            return 0;
        }
        // return n + sum(n-1);
        else
      {
        int sum = sum(n/10);
        return sum+=n%10;
      }
    
    }

    public static void sum(int num, int sum) {
        if (num == 0) {
System.out.println ("The Sum of the numbers is : " +sum );
return;
        }
            int digit = num % 10;
            sum += digit;
            sum(num / 10, sum);

    }

    public static void main(String[] args) {
        // show(5);
      System.out.println(

          sum(123)
      ); 
    }
}