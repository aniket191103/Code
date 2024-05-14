abstract  class Course{
    int id ;
    String name ;
    int duration ;
    void enroll(){

    }

    abstract void discount(int marks);

    Course(){
         System.out.println("Course Constructor is called");
    }

}
class ITcourse extends Course{
ITcourse(){
       // super ()  ;> it is called on its own  i.e it calls the parent constructor
}


  void discount(int marks){

 }
}

class ManagementCourse extends Course{
    void discount(int marks){

    }
}
public class Abstractclassdemo {
 public static void main(String[] args) {
    ITcourse ram = new ITcourse();
    ManagementCourse shaym = new ManagementCourse();
 }   
}
