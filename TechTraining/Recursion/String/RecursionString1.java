public class RecursionString1 {
    static String rverse(String str){
        // immutable sable strings and new string is needed 

        if(str.length()==0){

            return "";
        }
      String res=  str.substring(1);
      String result =rverse(res);
      char firstchar = str.charAt(0);
      return res+firstchar;
    }
    public static void main(String[] args) {
       String ans = rverse("Aniket");
       System.out.println(ans);
    }
}
