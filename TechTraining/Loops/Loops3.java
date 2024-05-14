public class Loops3 {
    public static void main(String[] args) {
        int num =32145;
        double result =0;

            int position=0;
        // int sum =0;


        while(num!=0){
            
            int digit= num%10;
            position++;
            result += Math.pow(10, digit-1) *position;
            // System.out.println("Digit: " +digit+ ", Position: "+position+", Result: "+result);
            num=num/10;
        }
        System.out.println((int)result);

        



    }
}
