
public class Pattern3 {
    
    public static void main(String[] args) {
        int range=5;
        for (int row = 1; row <=range ; row++) {

            for(int col =1;col<=range;col++){
                if (row==1 ||row==col ||col==1||col==range-row+1||row==range||col==range) {
                    System.out.print("*");

                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();;
        }
    }
}

