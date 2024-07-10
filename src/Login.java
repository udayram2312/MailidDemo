

public class Login {

    public String userName="1234";
    public String password="1234";



    public void loginStatus(String validUserName,String validPassword) throws CheckedException {

        if (validUserName.equals(userName) && validPassword.equals(password)) {
            System.out.println("login successfull");
        }else {
           throw new CheckedException(ErrorCode.LOGIN_FAILED.getCode(), ErrorCode.LOGIN_FAILED.getMessage());
        }


    }
}
