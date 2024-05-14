public class Recursion2 {
    public static void Show(int count){
        if(count==0){ //termination case , base case
            return;
        }
        System.out.println("Aniket" );
        Show(count-1);
        System.out.println("Srivastava"+count);
    }
  public static void Ques1(int num){
    if(num ==0)
    {
        return;
    }
    Ques1(num/10);
    System.out.println(num%10);
    
  }

  public static void SumOfDigit(int num, int sum ){
    if(num==0){
        System.out.println(sum);
         return ;
    }
    int digit = num%10;
    sum+=digit;
     SumOfDigit(num/10, sum);
  }
  public static int SumOfDigit2(int num){
    if(num ==0)
{
    return 0;
}
int digit = num %10;
digit = digit +SumOfDigit2(num /10);
System.out.println(digit);
return digit;


  }
    public static void main(String[] args) {
        // Show(5);
        // Ques1(12345);
       int x= SumOfDigit2(123);
        System.out.println(x);
    }
}
