public class ClimbingStair {
    static int Stair(int  n){
    if(n==0 ||n ==1){
        return 1;
    }

    return Stair(n-1)+Stair(n-2);
    }
    public static void main(String[] args) {
        System.out.println(Stair(3));
    }
}
