public class RopeCut {

    static int Solve(int n ,int x , int y, int z){
        if(n ==0){
            return 0;
        }

        if(n <0){
            return -1;
        }
int a = Solve(n-x, x, y, z)+1;
int b= Solve(n-y, x, y, z)+1;
int c = Solve(n-z, x, y, z)+1;


return Math.max(a,Math.max(c, b));
    }
    public static void main(String[] args) {
        System.out.println(Solve(5, 2, 5, 1));
    }
}
