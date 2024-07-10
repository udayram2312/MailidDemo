package bookmyshow;

public class PaymentProcess extends BookTicket implements Payment {
    public double myMoney;
    public PaymentProcess(String mobileNo, String otp, int noofSeats, double ticketPrice, double myMoney) {
        super(mobileNo, otp, noofSeats,ticketPrice);
        this.myMoney = myMoney;

    }
    @Override
    public boolean phonepe() {
        if(myMoney >= totalPrice){
            myMoney  = myMoney-totalPrice;
            System.out.println("remaining money"+ myMoney);
        }else{
            System.out.println(myMoney);
           // throw new CustomCheckedException(ErrorCode.PAYMENT_FAILED_103.getCode(), ErrorCode.PAYMENT_FAILED_103.getMessage());
        }
        return false;
    }
}
