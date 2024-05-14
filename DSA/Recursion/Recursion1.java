public class Recursion1 {
 public static void f( int count){

if(count ==5){
    return;
}else{
    System.err.println("Aniket" );
   
    f(++count);
}
 }

 public static void Print(int n) {

while(n >=1){
    System.out.println(n + " ");
    Print(--n);
    return;
}
 }
    public static void main(String[] args) {
        
// f(0);
Print( 4);
    }
}