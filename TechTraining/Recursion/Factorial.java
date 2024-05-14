public class Factorial {
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
    static void FactV(int num){
        if(num==1 ||num==0){
            System.out.println("Fact is "+ 1);return ;
        }

        else  if(num >1){
            int x = num *Fact(num-1);
            System.out.println( "Fact is "+x);
        }
    }
    public static void main(String[] args) {
     FactV(8);
        // System.out.println(x);
    }
}
