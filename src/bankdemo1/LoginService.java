package bankdemo1;

public class LoginService {

    public String login(User inputDataUser){

        String bankUserName = "uday";
        String bankPassword = "2312";
        int remainingAttempt = 3;
        if (!inputDataUser.locked)
            if(inputDataUser.userName.equals(bankUserName)
                    && inputDataUser.password.equals(bankPassword)){
                return "login is success";
            } else {
                inputDataUser.numberOfAttempts = inputDataUser.numberOfAttempts+1;
                if (inputDataUser.numberOfAttempts > remainingAttempt){
                    inputDataUser.locked = true;
                }
                return "user is locked";
            }else {
            return "user is locked";

        }
        }

}
