package bankdemo1;

public class LoginTest {

    public static void main(String[] args) {
        User user = new User();
        user.userName="uday";
        user.password="2312";

        LoginService loginService = new LoginService();
        String first=loginService.login(user);
        String second=loginService.login(user);
        String third=loginService.login(user);
        String fourth=loginService.login(user);
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(fourth);
}

}
