package paymentdemo;

public class Payment {

    private int money;
    private Account fromAccount;
    private Account toAccount;
    private String mobileNo;


    public Payment(int money,String mobileNo){
        this.money = money;
        this.mobileNo = mobileNo;
    }

    public Payment(int money,Account fromAccount,Account toAccount){
        this.money = money;
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
    }

    public Account getFromAccount() {
        return fromAccount;
    }

    public Account getToAccount() {
        return toAccount;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public int getMoney() {
        return this. money;
    }
}
