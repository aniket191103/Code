public class TotalConsonant {
    static int Total(String str, int index, int count) {
        // System.out.println(str);
        if (index >= str.length()) {
            // System.out.println(count);
            return count;
        }

        char ch = str.charAt(index);

        if (ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U') {
            count++;
        }

       return Total(str, index + 1, count);
    }

    public static void main(String[] args) {
        String str = "absdw";
        str =str.toUpperCase();
        int count=0;
       int  x= Total(str, 0,  count);
        System.out.println(x);
    }
}
