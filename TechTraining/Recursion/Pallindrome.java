public class Pallindrome {
    static int rev_num = 0; 
    static int base_pos = 1;
    public static int  Pal(int num ){
        if (num <= 0) {
            return 0; 
        }
        // System.out.println(copy==rev_num ?true:false);
        Pal(num / 10); 
        rev_num += (num % 10) * base_pos; 
        base_pos *= 10;
        return rev_num;
        }

    public static void main(String[] args) {
        int num = 12851;
       int x= Pal(num);
       System.out.print(x==num ?"Palindome" :"NOT");
    }
}
