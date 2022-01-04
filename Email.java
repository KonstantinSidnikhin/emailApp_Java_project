import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private String companySuffix = "aeycompany.com";
    private String department;
    private int defaultPasswordLength = 10;
    private int mailboxCapacity = 500;
    private String alternateMailbox ="";

    public Email(String firstName, String lastName) {

        this.firstName = firstName;
        this.lastName = lastName;
//    call a method showing department
        this.department = showDepartment();
//        System.out.println("your department is " + department);
//    set a method with a random password
        this.password = setRandomPassword();
//        System.out.println("your password is " + password);
//        call a method setting email
        this.email=setEmail();
//        System.out.println("your email is " + email );
    }

    private String showDepartment() {
        System.out.println("choose\n 1 for management \n 2 for development \n 3 for sales \n 0 for none");
        Scanner sc = new Scanner(System.in);
        int res = sc.nextInt();
        if (res == 1) {
            return ("management");
        } else if (res == 2) {
            return ("dev");
        } else if (res == 3) {
            return ("sales");
        } else return ("none");

    }

    private String setRandomPassword() {
        String alphabet = "ABCDEFGJHIKLMNOPQRSTUVWXYZ0123456789";
        char[] arr = new char[defaultPasswordLength];
        for (int i = 0; i < defaultPasswordLength; i++) {
            arr[i] = alphabet.charAt((int)(Math.random()*alphabet.length()));
        }
        return new String(arr);
    }

    private String setEmail(){
        return firstName.toLowerCase() + "."+lastName.toLowerCase()+"@"+department+"."+companySuffix;
    }

    public void setMailBoxCapacity(int mailboxCapacity){
        this.mailboxCapacity=mailboxCapacity;
    }

    public int getMailboxCapacity(){
        return mailboxCapacity;
    }

    public void setAlternateEmail(String alternateEmail){
        this.email=alternateEmail;
    }
    public String getEmail(){
        return email;
    }
    public String showInfo(){
        return firstName+lastName+"\n your department is : "+department + "\n your email is :" + email +"\nyour password is :"+ password+"\n mailbox capacity is "+mailboxCapacity;

    }
    public void changePassword(String newPass){
        this.password=newPass;
    }


}


