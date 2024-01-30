public class MailProcessTest {
    public static void main(String[] args){
        MailProcess Process = new MailProcess();
        MailDetails login = new MailDetails();
        login.Mail = "ram@gamil.com";
        login.Password = "ram@123";
        boolean MailStatus = Process.login(login);
        System.out.println(MailStatus);

    }
}
