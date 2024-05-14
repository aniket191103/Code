public class Pallindrome {

    static boolean IsPallindrome(String str, int start , int end){
            if(start>=end){
                return true;
            }

            if(str.charAt(start)!=str.charAt(end)){
                return false;
            }

            return IsPallindrome(str, start+1, end-1);


    }
    public static void main(String[] args) {
        String s = "raceMaxproductcar";
        System.out.print(IsPallindrome(s, 0, s.length()-1)?"Pallindrome":"Not a Pallindrome");
    }
}
