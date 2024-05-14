/**
 * Email
 */
class Email {
    static Email email = new Email(); // EagerSingleton

    private Email() {

    }

    static Email getEmailInstance() {
        // if(email==null){
        // email= new Email();
        // Lazy Singleton : ondemand creation
        // }
        return email;
    }

    // when we create an object the default constructor gets called itself,
    // there are ways when object will be created btu object wont bw created

    // Steps to stop creating objects 1: Private the constructor or 2: abstract
}

// Eager singlle ton : Phele hi object banadia jsise baar baar check na kro

public class Singleton {
    public static void main(String[] args) {
        Email e1 = Email.getEmailInstance();
        Email e2 = Email.getEmailInstance();
        Email e3 = Email.getEmailInstance();
        System.out.println(e1 == e2 && e2 == e3);

    }
}
