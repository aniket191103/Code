import java.util.*;
public class RevAStringUsingStack {
    static String Rev(String str ){
        Stack<Character> ch = new Stack<>();
        int index =0;
        while(index<str.length()){
            ch.push(str.charAt(index));
            index++;
        }
        StringBuilder res= new StringBuilder("");
        while (!ch.isEmpty()) {
            char curr = ch.pop();
            res.append(curr);
        }
        return res.toString();

    }
    public static void main(String[] args) {
        String res  = Rev("abc");
        System.out.println(res);
    }
}
