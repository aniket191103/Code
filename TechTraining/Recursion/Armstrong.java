public class Armstrong {
    public static void  Arm(int n, int count,int sum){
        while (n!=0){
            System.out.println(sum);
            return ;
        }
        int  digit = n%10;
        sum = sum+(int)Math.pow(digit, count);
        count++;
        Arm(n/10,count,sum);
    }
    public static void main(String[] args) {
        int n = 153;
         Arm(n,0, 0);
     
    }
}
