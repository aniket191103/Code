public class Pattern1 {
        static void print(int n ){
            if(n==0){
                return;
            }
            print(n-1);
            System.out.print('*');
        }
        static void lines(int n){
            if(n ==0){
            return;
            }
            print(n);
            System.out.println();
            lines(n-1);
        }
        public static void main(String[] args) {
            lines(5);
     }
}