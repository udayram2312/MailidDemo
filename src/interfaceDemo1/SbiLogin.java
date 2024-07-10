package interfaceDemo1;

public class SbiLogin implements BankLogin,LoginWithOtp{
    @Override
    public int validationOtp() {
        return 0;
    }
String localUs = "";
    String localPass= "";

    String name;
    String pass;

    @Override
    public boolean loginProcess() {
            try{
                if (localPass.equals(pass)) {

                    HDFCLogin hdfcLogin;
                }

            }catch (Exception e){
                System.out.println(" loging "+e.getMessage());
            }finally {
                System.out.println("final");
            }

        return true;
    }
    public  int accountValidation() throws Exception {
        if (localPass.equals(pass)) {

            HDFCLogin hdfcLogin;
        }else {
            throw  new Exception();
        }

        return 0;
    }
}
