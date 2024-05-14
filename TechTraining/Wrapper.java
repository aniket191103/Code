import java.util.LinkedList;

public class Wrapper {
    public static void main(String[] args) {
        int  x = 10;
            Integer xx= 200;
            LinkedList <Integer> l =new LinkedList<>();
l.add(x);//Boxing 
int y = l.get(0);
System.out.println(y);
            System.out.println(xx.doubleValue());
    }
}
