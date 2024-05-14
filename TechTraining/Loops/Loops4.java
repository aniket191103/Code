import java.util.Scanner;

public class Loops4 {
    public static void main(String[] args) {
        int num =12345;
        int  result=0;
        int count=0;
        int copy=num;
        while(copy!=0){
            copy =copy/10;
            count ++;
            // shifting the bits to the left by 'rotate' places
        }
            int rotate= 8;


            rotate=rotate%count;
            int rhs = num% (int)Math.pow(10, rotate);
            int lhs = num / (int)Math.pow(10, rotate);
            result = ((rhs * (int) Math.pow(10 , count-rotate)) + lhs) ;
            System.out.println("num after rotation is " + result );
        
    }
}
