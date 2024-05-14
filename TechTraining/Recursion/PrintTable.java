public class PrintTable {
    public static void Print(int num , int value){

        if(value==0){
            return;
        }
        Print(num, value-1);
        System.out.println(num+"*"+ value +" ="+ (num*value));
    }

    public static String PrintT(int num , int value){
         if (value==0){
            return " ";
        }
       String result = PrintT(num, value-1);
       System.out.println(result);
       String Exp = num+"*"+ value +"="+ (num*value) +"\n";

       return result+Exp;
        // return num+"*"+ value+"="+ (num*value);
    }     
    public static void main(String[] args) {
      String R=  PrintT(5, 10);
      System.out.println(R);
    }
}
