import java.text.NumberFormat;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class SalarySlip {
    static Locale locale;
static ResourceBundle rb; //reacd propwrties


static  void loadBundle(){
    //initialize the resource bundle

    rb =ResourceBundle.getBundle("message", locale);
}





    // Formating
    // Reference Variable
    // NumberFormat is an abstract class so we cannit crteate objects of abstract
    // class but we can create object of its specific class
    // nf =NumberFormat.getInstance(null);
    public static String formatedSalary(double unformattedSalary) {
        NumberFormat nf = NumberFormat.getCurrencyInstance(locale); // Using the correct locale
        return nf.format(unformattedSalary);

        // create only once and use it till we want
        // Singleton: it is adesign pattern that restricts the instantation of the class
        // only once
        //
    }

    // formating of results in basic salary
    // using number formatting class
    static String properCase(String name) {
        String names[] = name.split(" ");
        String fullName = "";
        for (int i = 0; i < names.length; i++) {
            String n = names[i];
            char FirstChar = n.charAt(0);
            String FirstLetterCap = String.valueOf(FirstChar).toUpperCase();
            String remString = n.substring(1).toLowerCase();
            String n2 = FirstLetterCap + remString;
            fullName = fullName + n2 + " ";
        }
        return fullName.trim();
    }

    static void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("press 1 for English");

        System.out.println("हिंदी  के  लिए  2  दबाएँ" + "");

        System.out.println("Appuyez sur 3 pour le français");
        int choice = scanner.nextInt();
        if (choice == 1) {
            locale = new Locale("EN", "US");
        }
        if (choice == 2) {
            locale = new Locale("HI", "India");
        }
        if (choice == 3) {
            locale = new Locale("FR", "France");
        }

        loadBundle();
        System.out.println(rb.getString("id.msg"));
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println(rb.getString("name.msg"));
        String name = scanner.nextLine();
        System.out.println(rb.getString("salary.msg"));
        double basicSalary = scanner.nextDouble();

        compute(id, name, basicSalary);
        scanner.close();
    }

    static void compute(int id, String name, Double basicSalary) {
        double hra = basicSalary * 0.50;
        double ta = basicSalary * 0.40;
        double da = basicSalary * 0.20;
        double ma = basicSalary * 0.25;
        double pf = basicSalary * 0.05;
        print(id, name, basicSalary, hra, ta, da, ma, pf);
    }

    static void print(int id, String name, double basicSalary, double hra, double ta, double da, double ma, double pf) {
        System.out.println("Id :" + id);
        System.out.println("Name :" + properCase(name));
        System.out.println("Basic Salary :" + formatedSalary(basicSalary));
        System.out.println("HRA " + formatedSalary(hra) + "\t\t\t" + "PF " + formatedSalary(pf));
        System.out.println("TA " + formatedSalary(ta));
        System.out.println("DA " + formatedSalary(da));
        System.out.println("MA " + formatedSalary(ma));
    }

    public static void main(String[] args) {
        input();
        // Compute

    }
}