
public class Pattern4 {
    public static void main(String[] args) {
        int range = 5; // size of pattern
        for(int i = 1;i<=range;i++){
            for(int j=1;j<=range-i;j++){
                System.out.print(" ");
            }
            for(int star =1;star<i;star++){
                System.out.print("*");
            } 
            System.out.println();
        }
    }
}
