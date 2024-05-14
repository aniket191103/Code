public class Conditional {
public static  void Problem1(){
    int num1 = 2;
     int num2 =5;
      int num3 =8;

      if(num1<num2){
        if(num2>num3){
            System.out.println("nums2 is largest");
        }
        else if(num2<num3){
            System.out.println("num3 is the largest");
        }
      }
}
public static void Switch(){
// Colon vs arrow?
//yeild return break


    // String choice ="Burger";
    // switch (choice) {
    //     case "Burger"->
    //         System.out.println("Price 452");
           
    //     case "Drink" ->
    //         System.out.println("Price 6531");
          
    //     default ->
    //        System.out.println("vfbd");
    // }


// arrow doesnt  let loop to go to brrak i.e. auto break 

int d =764;
int r = switch(d){
 case 1-> {
    System.out.println("21");
    yield 10;

 }
 default->{
    // System.out.println("dfcf");
    yield 54;
}
};
System.out.println(r);
}


    public static void main(String[] args) {
        Switch();
        // if only takes boolean values in java 




        // Problem 
        // Find the greater number in 3 numbers

    }
}
