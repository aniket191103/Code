import java.util.Scanner;
public class Input {

    public static void main(String[] args) {
        // System.in.read();
        int count=0;
        // Scanner scanner = new Scanner(System.in);
        Scanner scanner=new Scanner("hello! how are you");
        while (scanner.hasNext()) {
            System.out.println(scanner.next());
            count ++;

        }
        System.out.println(count);
        scanner.close();

    }
}
