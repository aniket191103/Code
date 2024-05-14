

public class Subsequence {

    static void Sub(String str, String reString){

        if(str.length()==0){
            System.out.print( reString+' ');
            return;
        }

            Sub(str.substring(1), reString); // not takeit
            Sub(str.substring(1), reString+str.charAt(0));

    }
    public static void main(String[] args) {
       Sub("abc", "");
        
    }
}
