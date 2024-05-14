
public class Pattern2 {
    public static void main(String[] args) {
        int range=5;
        for (int i = 1; i <=range ; i++) {

            for(int col =1;col<=5;col++){
                if (i==1 ||i==range ||col==1||col==range) {
                    System.out.print("*");

                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();;
        }
    }
}
