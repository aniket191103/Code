public class Loops {
    // // while
    // for
    // do while
    // enchanced for loop

    public static void Optimized(){
        int num =88;
        for(int i =2;i<=Math.sqrt(num);i++){
            if(num%i==0){   
                System.out.println(" Not a Prime Number");
                return;
            }
        }
    }
    public static void main(String[] args) {

        {

            // int num = 17;
            // int count = 0;
            // for (int i = 2; i <num; i++) {
                //     if (num % i == 0) {
                    //         count++;
                    //     }
                    // }
                    // if (count == 0) {
                        //     System.out.println("Prime Number");
                        // } else {
                            //     System.out.println("Not a prime number");
                            // }
                        }
        Optimized();

    }

}
