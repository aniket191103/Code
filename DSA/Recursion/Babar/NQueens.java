/**
 * NQueens
 */
public class NQueens {
static void Queen(char board[][], int row){
if(board.length<4){
    System.out.println("No possible Solution");
    return;
}

if(row>=board.length){
printBoard(board);
return;
}
    //column
    for (int j = 0; j < board.length; j++) {
        if(isSafe(board,row, j)){

            board[row][j]='Q';
            Queen(board, row+1);
            board[row][j]='X'; // backtracking step
        }
    }
}
static boolean isSafe(char board[][], int row , int col){
    /// vertical up 
    for (int i = row-1; i >=0; i--) {
        if(board[i][col]=='Q'){
            return false;
        }
    }
    // diagonal left
    for (int i = row-1, j=col-1; i>=0&& j>=0;i--,j--) {
        if(board[i][j]=='Q'){
            return false;
        }
    }




    //diagonal right
    for (int i = row-1 , j =col+1; i >=0  && j<board.length; i--,j++) {
        if(board[i][j]=='Q'){
            return false;
        }
    }
    return true;
}
static void printBoard(char board[][]){
    System.out.println("----------");
     for (int i = 0; i < board.length; i++) {
        for (int j = 0; j < board.length; j++) {
            System.out.print(board[i][j]+" ");
        }
        System.out.println();
    }
}
 public static void main(String[] args) {
    int  n =4;
    char baord[][]=new char [n][n];

    for (int i = 0; i < baord.length; i++) {
        for (int j = 0; j < baord.length; j++) {
        baord[i][j]='.';
        }
    }
    Queen(baord,0);
 }   
}