public class Pyramid {
    public static void Print(int n){
        
        for(int i =0;i<n;i++){
            for(int sp =0;sp<n-i-1;sp++){
                System.out.print(" ");
            }
                for(int st =0;st<(2*i+1);st++){

                    System.out.print("*");
                }
                for(int sp =0;sp<n-i-1;sp++){
                    System.out.print(" ");
                }
                System.out.println();
        }
     
    }
    public static void main(String[] args) {
        Print(5);
    }
}