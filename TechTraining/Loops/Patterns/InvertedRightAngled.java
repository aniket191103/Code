public class InvertedRightAngled {
    public static void Print(int n ){
        for(int i =n;i>0;i--){
            for(int j =i-1;j>=0;j--){
                // System.out.print("*");
                System.out.print(i-j);
            } 
            System.out.println();
        }
    }
 public static void main(String[] args) {
    Print(5);
 }   
}
