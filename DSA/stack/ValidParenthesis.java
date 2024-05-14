import java.util.*;

public class ValidParenthesis {
    static void valid(String str) {
        Stack<Character> ch = new Stack<>();
        int index = 0;
        while (index < str.length()) {
            ch.push(str.charAt(index));
            index++;
        }
        while (ch.size() > 1) {
            char res = ch.pop();
            if (ch.isEmpty()) {
                System.out.println("false"); // There's a closing parenthesis with no corresponding opening parenthesis
                return;
            }
            char res1 = ch.pop();
            if ((res == ')' && res1 != '(') || (res == '}' && res1 != '{') || (res == ']' && res1 != '[')) {
                System.out.println("false"); // Mismatched parenthesis
                return;
            }
        }
        if (!ch.isEmpty()) {
            System.out.println("false"); // There are remaining opening parenthesis
        } else {
            System.out.println("true"); // All parentheses are matched
        }
    }

    public static void main(String[] args) {
        String str = "{[]}";
        valid(str);
    }
}
