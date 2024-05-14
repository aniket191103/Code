import java.util.ArrayList;
import java.util.List;
public class GoodNumber{
    public static List< Integer > goodNumbers(int a, int b, int digit) {
        // Write your code here.
    List<Integer> list= new ArrayList<>();
        if( a>=b){
            return list;
        }
        System.out.println("Ener");
int count =0;
int number =0;
        if(number >=0){
             number = a %10;
            count ++;
            a/=10;
            System.out.println(count);
        }

        if(count >=2){

        int sum = a %(int)Math.pow(10,count-1)+a%(int)Math.pow(10, count-2);
         System.out.println(sum+" " +number);
            if(number >sum ){
                list.add(a);
            }
        }
        return goodNumbers(a+1, b, digit);
    }
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        list =  goodNumbers(840, 850, 6);

        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
