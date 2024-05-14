

public class Duplicate {

    static String Remove(String str){
        if(str.length()<=1){
            return str;
        }
        if(str.charAt(0) == str.charAt(1)){
            return Remove(str.substring(1));
        }
        else 
        {
            return str.charAt(0)+Remove(str.substring(1));
        }
    }

    static String Removeandaddstar(String str){
        if(str.length()<=1){
            return str;
        }
        if(str.charAt(0) == str.charAt(1)){
           return str.charAt(0)+"*"+Removeandaddstar(str.substring(1));
        }
        else 
        {
            return str.charAt(0)+Remove(str.substring(1));
        }
    }
    public static void main(String[] args) {
       System.out.println(
           Removeandaddstar("AABB")

       ); 
    }
}
