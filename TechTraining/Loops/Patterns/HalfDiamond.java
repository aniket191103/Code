public class HalfDiamond {
    public static void Print(int n){
        for(int i =0;i<n-1;i++){
          
            for(int j =0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
           
        }
        for(int i =n-1;i>=0;i--){
            for(int j =i;j>=0;j--)
             System.out.print("*");
             
             System.out.println(); 
        }
    }
    public static void main(String[] args) {
     Print(5);   
    }
}
