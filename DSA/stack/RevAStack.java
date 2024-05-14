import java.util.*;

public class RevAStack {

    static void Rev(Stack<Integer> s) {
        if (s.isEmpty()) return;

        Stack<Integer> res = new Stack<>();
        while (!s.isEmpty()) {
            int top = s.pop();
            res.push(top);
        }

        while (!res.isEmpty()) {
            System.out.println(res.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        Rev(s);
    }
}
