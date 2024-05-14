import java.util.HashMap;

class NumberToWordsConverter {
    public static final HashMap<Integer, String> numberMap = new HashMap<>();

    static {
        numberMap.put(0, "Zero");
        numberMap.put(1, "One");
        numberMap.put(2, "Two");
        numberMap.put(3, "Three");
        numberMap.put(4, "Four");
        numberMap.put(5, "Five");
        numberMap.put(6, "Six");
        numberMap.put(7, "Seven");
        numberMap.put(8, "Eight");
        numberMap.put(9, "Nine");
        numberMap.put(10, "Ten");
        numberMap.put(11, "Eleven");
        numberMap.put(12, "Twelve");
        numberMap.put(13, "Thirteen");
        numberMap.put(14, "Fourteen");
        numberMap.put(15, "Fifteen");
        numberMap.put(16, "Sixteen");
        numberMap.put(17, "Seventeen");
        numberMap.put(18, "Eighteen");
        numberMap.put(19, "Nineteen");
        numberMap.put(20, "Twenty");
        numberMap.put(30, "Thirty");
        numberMap.put(40, "Forty");
        numberMap.put(50, "Fifty");
        numberMap.put(60, "Sixty");
        numberMap.put(70, "Seventy");
        numberMap.put(80, "Eighty");
        numberMap.put(90, "Ninety");
    }

    public static String numberToWords(int num) {
        if (num == 0) {
            return numberMap.get(0);
        }
        return convertToWords(num);
    }

    private static String convertToWords(int num) {
        String result = "";
        if (num >= 1000000000) {
            result += convertToWords(num / 1000000000) + " Billion ";
            num %= 1000000000;
        }
        if (num >= 1000000) {
            result += convertToWords(num / 1000000) + " Million ";
            num %= 1000000;
        }
        if (num >= 1000) {
            result += convertToWords(num / 1000) + " Thousand ";
            num %= 1000;
        }
        if (num >= 100) {
            result += numberMap.get(num / 100) + " Hundred ";
            num %= 100;
        }
        if (num > 0) {
            if (num <= 20 || num % 10 == 0) {
                result += numberMap.get(num);
            } else {
                result += numberMap.get(num / 10 * 10) + " " + numberMap.get(num % 10);
            }
        }
        return result.trim();
 
    }
    public static void main(String[] args) {
        System.out.println(numberToWords(31545413));
    }
}
