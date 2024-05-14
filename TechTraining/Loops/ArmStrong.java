public class ArmStrong {
     public static void main(String[] args) {
        int  num =133;
        int copy=num;
      int  result =0;
    while(num !=0)
    {
        int  Digit= num%10;
        // System.out.println("Digits are "+Digit);

        result=result+(int)Math.pow(Digit, 3);
        
        num/=10;

    }
    if( copy ==result){
        System.out.println("ArmStrong Number");
    }
    else{
        System.out.println("Not a Armstrong Number");
    }
}
}
