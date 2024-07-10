package zomato;

public class LoginProcess implements ZomatoLogin {


    @Override
    public String login(String mailId, String password) {
        if(MailId.equals(mailId) && Password.equals(password)){
            return "login sucessfull";
        }else{
            return "login unsuccessfull";

        }

    }
}
