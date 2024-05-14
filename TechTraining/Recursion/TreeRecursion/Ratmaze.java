import java.util.*;
public class Ratmaze {
    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here

        ArrayList<String> ans = new ArrayList<>();
        Helper(m, n, 0,0,ans,"");
        return ans;
    }
     static void Helper(int[][] m, int n ,int row, int col,ArrayList<String> ans,String res ){
            if(row==n-1 && col==n-1){
                ans.add(res);
                return;
            }
            if(row >=n || col>=n ){
                return  ;
            }

            
            if(row <n-1 &&m[row+1][col]==1){
                Helper(m, n, row+1, col, ans, res+"D");
            }
            if(row >0&&m[row-1][col]==1){
                Helper(m, n, row+1, col, ans, res+"U");
            }
            if(col<n-1 &&m[row][col+1]==1){
                // System.out.println(col);
                Helper(m, n, row, col+1, ans, res+"R");
            }
            if(col>0 &&m[row][col-1]==1){
                // System.out.println(col);
                Helper(m, n, row, col+1, ans, res+"L");
            }
            // System.out.println(row+" "+col+ " "+res);

     }
     public static void main(String[] args) {
        int m[][]= {{1, 0, 0, 0},
        {1, 1, 0, 1}, 
        {1, 1, 0, 0},
        {0, 1, 1, 1}};

        int n = m.length;

        findPath(m, n);

        for (String a :findPath(m, n) ) {
            System.out.println(a);
        }
     }
}
