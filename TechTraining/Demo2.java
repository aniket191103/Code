public class Demo2 {

    public static void main(String[] args) {
        StringBuffer sb= new StringBuffer();
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append("Hello");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.ensureCapacity(233);
        sb.append("disalnkdsdlsandslfnaflkjhgfdfghndnc");
        System.out.println(sb.capacity());
        System.out.println(sb.length());

    }
}
