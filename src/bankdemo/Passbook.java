package bankdemo;

public class Passbook {
    public String accountNo;
    public String ifscCode;
    public String balance;

    @Override
    public String toString() {
        return "Passbook{" +
                "accountNo='" + accountNo + '\'' +
                ", ifscCode='" + ifscCode + '\'' +
                ", balance='" + balance + '\'' +
                '}';
    }
}
