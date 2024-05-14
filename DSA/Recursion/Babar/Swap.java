public class Swap {
    static int swap(int a, int b){
        a=a^b;
        b=a^b;
        a=a^b;

        return b;
        
    }
    public static void main(String[] args) {
        System.out.println(swap(2, 5)
        );
    }
}
