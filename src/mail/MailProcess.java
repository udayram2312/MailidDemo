package mail;

public class MailProcess {
    boolean login(MailDetails  details) {
        String Mail="ram@gamil.com";
        String Password="ram@123";
        if (Mail.equals(details.Mail) && Password.equals(details.Password)) {
            return true;


        }else{
            return false;
        }


    }

}
