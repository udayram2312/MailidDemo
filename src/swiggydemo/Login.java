package swiggydemo;

public class Login {

    public String userName;
    public String password;

    public boolean Login(String userName,String password){
        if(this.userName.equals(userName)&& this.password.equals(password)){
            System.out.println("login successfull");
            return  true;

        }else {
            System.out.println("login unsuccessfull");
            return  false;

        }
    }

}
