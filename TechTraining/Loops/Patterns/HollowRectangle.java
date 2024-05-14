public class HollowRectangle {
    public static  void Print(int range ){
    
        for (int i = 1; i <=range ; i++) {

            for(int col =1;col<=range;col++){
                if (i==1 ||i==range ||col==1||col==range) {
                    System.out.print("*");

                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();;
        }
}
public static void main(String[] args) {
    Print(4);
}
    
}