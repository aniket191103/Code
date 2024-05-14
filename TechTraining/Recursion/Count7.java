public class Count7 {
    static int Count(int num, int count){
        while (num==0) {
            return count;
        }
        int digit= num%10;

        if(digit==7){
            return Count(num/10, count+1);
        }
      return Count(num/10, count);
    }
    public static void main(String[] args) {
        int x =Count(123, 0);
        System.out.println(x);
    }
}
