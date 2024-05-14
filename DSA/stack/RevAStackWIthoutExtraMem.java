import java.util.*;
public class RevAStackWIthoutExtraMem {
    static void rev(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top =s.pop();
        rev(s);
        pushAtbottom(s, top);
    }
    public static void pushAtbottom(Stack<Integer> s , int data){
        if(s.isEmpty())
        {
         s.push(data);
         return;
        }
         int top = s.pop();
         pushAtbottom(s, data);
         s.push(top);
      }
      static void printStack(Stack<Integer>s){
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
      }
    public static void main(String[] args) {
        Stack <Integer> s= new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        // printStack(s);
        rev(s);
        printStack(s);
    }
}
