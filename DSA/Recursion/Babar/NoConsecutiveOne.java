import java.util.ArrayList;
import java.util.List;

public class NoConsecutiveOne {
    public static List<String> generateString(int N) {
        List<String> res = new ArrayList<>();
        GenerateHelper(N, "", res);
        return res;
    }

    static void GenerateHelper(int n, String str, List<String> res) {
        if (str.length() == n) {
            res.add(str);
            return;
        }

        // If the last character of the string is '1', append '0'.
        if (str.isEmpty() || str.charAt(str.length() - 1) == '1') {
            GenerateHelper(n, str + '0', res);
    }

        // If the last character of the string is '0' or the string is empty, append '1'.
        if (str.isEmpty() || str.charAt(str.length() - 1) == '0') {
            GenerateHelper(n, str + '1', res);
            GenerateHelper(n, str + '0', res);

        }
    }

    public static void main(String[] args) {
        List<String> result = generateString(4);
        for (String list : result) {
            System.out.print(list + " ");
        }
    }
}
