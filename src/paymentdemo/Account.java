package paymentdemo;

public class Account {

    private String accountNumber;
    private String mobileNo;

    public Account(String accountNumber, String mobileNo) {
        this.accountNumber = accountNumber;
        this.mobileNo = mobileNo;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getMobileNo() {
        return mobileNo;
    }
}
