public class ReversePyramid {
    public static void Print(int  n ){
        for(int i =n;i>=1;i--){
            for(int sp =n-i;sp >0;sp-- )
            System.out.print(" ");
            for(int st= (2*i -1);st>0;st--){
                System.out.print("*");
            }
            for(int sp =n-i;sp >0;sp-- ){

                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
     Print(5);   
    }
}
