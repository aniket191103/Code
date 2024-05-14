public class String2 {
    static String Replace(String str,char search) {
        if (str.length() == 0) {
            return "";
        }
        String sub= str.substring(1);
        String result = Replace(sub, search);
        char first = str.charAt(0);

        if(first == search){
            return "x"+ result;
        }
        else{
            return first+result;
        }
    }
    public static void main(String[] args) {
        String Str = Replace("hello", 'l');
System.out.println(Str);
    }
}
