class ReverseInt {
    public static int reverse(int x) {
        int count = countDigits(x);
        int rest= revDigit(x, count, 0);
        return rest;
    }

    static int revDigit(int x , int count, int result){
        if(x ==0){
             return result;
        }
        int digit = x %10;
        
        
            return  revDigit(x/10, count-1, result+= digit*(int)Math.pow(10, count-1));

    }
    public static int countDigits(int number) {
        if (number == 0) {
            return 0;
        } else {
            return 1 + countDigits(number / 10);
        }
        }
     public static void main(String[] args) {
        int x = reverse(1534236469);
        System.out.print(x);
     }
}