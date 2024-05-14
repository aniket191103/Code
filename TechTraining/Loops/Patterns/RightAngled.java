public class RightAngled {
    public static void Print(int  n){
    for(int row=0;row<n;row++){
        for(int j =0;j<=row;j++){
            System.out.print("*");
        }
        System.out.println();

    }

    }
    public static void main(String[] args) {
        Print(5);
    }
}
