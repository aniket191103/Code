public class StronNumber {
    public static void main(String[] args) {
        int num =15585,copy=num;
        int result =0;

        int digit=0;
        while (num !=0){
            int fact =1;
            digit= num%10;
            // System.out.print(digit + " ");
            for(int i =digit;i>0;i--){
                 fact= fact*i;
                }
                result= fact +result;
                // System.out.print(result+" ");
                
                num/=10;
            }
                if(result==copy){
                    System.out.println("Strong NUMBER");
                }
                else{
                    System.out.println("Not a strong number");
                }

    }
}
