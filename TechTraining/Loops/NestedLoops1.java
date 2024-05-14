public class NestedLoops1 {
    public static void main(String[] args) {
        outer:
        for(int i=1;i<4;i++){
            for(int j =1;j<=3;j++){

                if(i==j){
                    // break; // exit from the current loop
                    // return ; exit from the current function 
                    // continue outer; //Skips the current 
                    break outer;              }
            System.out.println(i+" "+j);
            }      }
    }
}
