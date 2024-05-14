public class NumberRightAngled {
    public static void Print(int n){
        for(int i=0;i<n;i++){
            for(int j =1;j<=i;j++){
                System.out.print(j);
                // System.out.print(i);
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Print(6);
    }
}
