import java.util.Scanner;

public class input2 {
    public static void main(String[] args) {
        int a []= {2,3,4,5,6,6,6};
        for(int i =0;i<a.length;i++){
            // System.out.println("Element at index "+i+" is :"+a[i]);
        }
        Scanner scanner= new Scanner(System.in);
        System.out.println("emter your password");
        char q []= System.console().readPassword();
        for(int i =0;i<q.length;i++){
            System.out.print(q[i]);
        
        scanner.close();
    }
}
}
