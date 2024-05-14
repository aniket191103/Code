public class StrongNo {
    static int Strong(int num, int sum){
        if(num ==0){
            return sum;
        }

        int digits = num %10;
        int x =  Fact(digits);
        
        sum =sum+ x;
       return Strong(num/10, sum);
    
    }

    static  int Fact( int num ){
        if( num==0 || num ==1){
            // System.out.println("Factorial is " +1);
             return 1;
        }

        if(num >1){
             return (num* Fact(num-1));
        }
        return 0;
    }
    public static void main(String[] args) {
       
        int num =15;
         int x =  Strong(num , 0); 
         System.out.print( x==num?"Strong Number":"Not A strong number");
    }
}
