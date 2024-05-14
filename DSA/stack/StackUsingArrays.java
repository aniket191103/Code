import java.util.ArrayList;

/**
 * StackUsingArrays
 */
public class StackUsingArrays {

    static class Stack {
        static ArrayList<Integer> list= new ArrayList<>();
            public  boolean isEmpty(){
                return list.size()==0;
            }

            //psuh

            public  void push(int data){
                list.add(data);
            }
            public  int pop (){
                int top=list.get(list.size()-1);
                list.remove(list.size()-1);
                return top;
            }
            // peek
             public  int peak (){
                int top=list.get(list.size()-1);
                return top;
             }

    }
public static void main(String[] args) {
    Stack  s = new Stack();
    s.push(1);
    s.push(2);
    s.push(3);

    while (!s.isEmpty()) {
        System.out.println(s.peak());
        s.pop();
    }
}
}