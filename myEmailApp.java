import java.util.Arrays;

public class myEmailApp {
    public static void main(String[] args) {
        Email email = new Email("Johan","Sebastian");
//        email.setAlternateEmail("sidnikhin@yande.ru");
//        System.out.println(email.getEmail());
        email.setAlternateEmail("sidnikhin@yandex.ru");
        email.changePassword("myPassword123");
        System.out.println(email.showInfo());
    }


}
