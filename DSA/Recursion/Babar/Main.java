import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Solution {

    static ArrayList<String> getExpressions(String input, int target) {
        ArrayList<String> result = new ArrayList<>();
        generateExpressions(input, target, 0, "", 0, 0, result);
        return result;
    }

    public static void generateExpressions(String digits, int target, int index, String expression, long evalSoFar, long lastValue, ArrayList<String> result) {
        if (index == digits.length()) {
            if (evalSoFar == target) {
                result.add(expression);
            }
            return;
        }

        for (int i = index; i < digits.length(); i++) {
            if (i != index && digits.charAt(index) == '0') {
                break; // Skip leading zeros
            }
            long currentNum = Long.parseLong(digits.substring(index, i + 1));

            if (index == 0) {
                generateExpressions(digits, target, i + 1, expression + currentNum, currentNum, currentNum, result);
            } else {
                generateExpressions(digits, target, i + 1, expression + "+" + currentNum, evalSoFar + currentNum, currentNum, result);
                generateExpressions(digits, target, i + 1, expression + "-" + currentNum, evalSoFar - currentNum, -currentNum, result);
                generateExpressions(digits, target, i + 1, expression + "*" + currentNum, evalSoFar - lastValue + lastValue * currentNum, lastValue * currentNum, result);
            }
        }
    }
}
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().trim().split("\\s+");
        if (input.length != 2) {
            System.out.println("Invalid input format. Please provide input_string and target_value separated by space.");
            return;
        }

        String numStr = input[0];
        int target = Integer.parseInt(input[1]);

        ArrayList<String> res = Solution.getExpressions(numStr, target);
        if (res.isEmpty()) {
            System.out.println("No expressions evaluate to the target.");
        } else {
            for (String expr : res) {
                System.out.println(expr);
            }
        }
    }
}
