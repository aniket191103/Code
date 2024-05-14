public class MazePath {
    static int count = 0;

    static void path(int arr[][], int row, int column, String currentPath) {
        int n = arr.length;
        if (row >= n || column >= n) {
            return;
        }
        // Append the current cell to the path
        currentPath += "(" + row + "," + column + ") ";
        // If reached the bottom-right cell, print the path and increment the count
        if (row == n - 1 && column == n - 1) {
            System.out.println("Path " + (++count) + ": " + currentPath);
            return;
        }
        path(arr, row + 1, column, currentPath+"H"); // Move down
        path(arr, row, column + 1, currentPath+"V"); // Move right
    }


    static void getMAzeOption(int row, int column,int endRow, int endCol, String res){
        if(row>=endRow || column>=endCol){
            return;
        }
if(row==endRow-1 && column==endCol-1){
    System.out.println(res);
    return;
}

    getMAzeOption(row+1, column, endRow, endCol, res+"H");  
    getMAzeOption(row, column+1, endRow, endCol, res+"V");  
    }
    public static void main(String[] args) {
        // int arr[][] = new int[3][3];
        // path(arr, 0, 0, "");
        // System.out.println("Total number of paths: " + count);

        getMAzeOption(0, 0, 3, 3, "");
    }
}
