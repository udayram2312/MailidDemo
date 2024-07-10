public class Test {

    public static void main(String[] args){

        Login login = new Login();

        try {
            login.loginStatus("1234","123");
        }catch(CheckedException e){
           System.out.println("Error Code " +e.getCode() +"  " +"Error Message " +e.getMessage());
        }

    }
}
