public class DivideRodIntoMAxSegment {
    static int MaxSegment(int n , int x, int y ,int z){
        if(n ==0){
            return 0;
        }
        if(n<0){
            return Integer.MIN_VALUE;

        }

        int a = MaxSegment(n-x, x, y, z)+1;//plus one kyuki n -z ki call bhi gyi h 
        int b = MaxSegment(n-y, x, y, z)+1;
        int c = MaxSegment(n-z, x, y, z)+1;

        int ans = Math.max(a, Math.max(c,b));

        return ans;
    }
    public static void main(String[] args) {
        int x = MaxSegment(7, 5, 2, 2);
        if(x<0){
         x=0;
        }
        System.out.println(x);
    }
}
