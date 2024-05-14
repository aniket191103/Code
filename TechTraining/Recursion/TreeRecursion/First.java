/**
 * First
 */
public class First {
static void fun(int n){

    if(n<=0){
        return ;
    }

    //Stack build , pre called
    System.out.println("pre Call"+n);
    fun(n-1);
System.out.println("Between Call"+n);
    //fall of first branch then only second branch works
    fun(n-2);
    System.out.println("PostCall"+n);
}
    public static void main(String[] args) {
        fun(2);
    }
}