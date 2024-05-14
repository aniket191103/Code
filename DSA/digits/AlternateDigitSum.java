class AlternateDigitSum {
    public int alternateDigitSum(int num) {
        int count =0;
    int cp= num;
    int sum=0;
    int digit =0;
    while(num!=0){

         digit = num%10;
        count ++;
        
        if(count %2==0){
            System.out.println(count );
            digit=digit*-1;
            System.out.println(sum+=digit);
        } 
        else{
            sum +=digit;
            System.out.println(count + "  "+sum +"  " +digit);
        } 
        num/=10;
    }
        return sum;
    }
    public static void main(String[] args) {
        AlternateDigitSum ads = new AlternateDigitSum();
        System.out.println("Alternate Digit Sum is : " +ads.alternateDigitSum(51));
    }
}
