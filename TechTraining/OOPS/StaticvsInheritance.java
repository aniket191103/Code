/**
 * StaticvsInheritance
 */

 class X{
     int  x ;// build with object
     static int y ;  // classs load 
     static {
        y=100;
        System.out.println("Static block  is called");
     
     }


     X(){
        x++; y++;
        System.out.println(" Called constructor"+x+" " +y);
     }
 }
public class StaticvsInheritance {

    public static void main(String[] args) {
        System.out.println(X.y);
        X  x1 = new X();
        X x2 = new X();
        X x3 = new X();
    }
}