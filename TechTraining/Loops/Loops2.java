import java.util.Scanner;

public class Loops2 {
    public static void main(String[] args) {
        int evenSum=0;
        int oddSum=0;

        Scanner scanner= new Scanner(System.in);
            System.out.println("Enter num");
        int n = scanner.nextInt();
        int position=0;
// 8765
while(n>0){
   int lastDigit = n %10;  
   position++; 
   n /= 10;    
   if (position%2==0)
       evenSum += lastDigit;
   else
       oddSum+=lastDigit;
}
        System.out.println("Even sum="+evenSum);
        System.out.println("Odd sum=" +oddSum);
scanner.close();
    }
    }
