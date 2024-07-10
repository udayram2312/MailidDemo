package swiggy;

public class Login {

    private String userName;
    private String password;

    public boolean Login() {

        if (userName.equals("udayram")  && password.equals("udayram2312")) {
            System.out.println("Login successfull");
        }else {
            System.out.println("login unsuccessfull");
        }

        return true;
    }
}
