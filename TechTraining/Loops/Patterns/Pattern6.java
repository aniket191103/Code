
// int odd = 2*row +1 to calc odd 
public class Pattern6 {
    public static void main(String[] args) {
        int range = 5; // size of pattern
        for(int i = 1;i<=range;i++){
            for(int j=1;j<=range-i;j++){
                System.out.print(" ");
            }
            int odd = 2*i+1;
            for(int star =1;star<odd;star++){
                System.out.print("*");
            } 
            System.out.println();
        }
    }
}
