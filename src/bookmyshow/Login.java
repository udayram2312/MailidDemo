package bookmyshow;

public abstract class Login {
    public String mobileNo;
    public String otp;

    public Login(String mobileNo,String otp){
        this.mobileNo = mobileNo;
        this.otp = otp;
    }
    public boolean loginStatus(String mobileNo,String otp) {
        if (this.mobileNo.equals(mobileNo) && this.otp.equals(otp)) {
            System.out.println("login successfull");
        }else{
            System.out.println("login unsuccessfull");
//throw new BookMyShow.CustomCheckedException(ErrorCode.LOGIN_FAILED_101.getCode(), ErrorCode.LOGIN_FAILED_101.getMessage());
        }
           return false;
        }
    }


