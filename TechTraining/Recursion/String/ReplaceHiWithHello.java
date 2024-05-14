public class ReplaceHiWithHello {
    static String Replace(String str){
        if(str.length()<=1){
            return str;
        }
        if(str.charAt(0)=='H' && str.charAt(1)=='i'){
            String smallString=str.substring(2) ;
             String result=  Replace(smallString);
             return "Hello"+result;
        }
        else{
             String smallString= str.substring(1);
            String result=  Replace(smallString);
            char first =result.charAt(0);
            return first+result;
        }

    }
    public static void main(String[] args) {
      String x=  Replace("Hi Aniket Hi Tom");
    System.out.print(x);
    }
}
