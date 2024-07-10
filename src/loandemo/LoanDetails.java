package loandemo;

public class LoanDetails {

    public String holderName;
    public String accountNo;
    public int loanAmount;
    public double intrest;
    public int duration;

    @Override
    public String toString() {
        return "LoanDetails{" +
                "holderName='" + holderName + '\'' +
                ", accountNo='" + accountNo + '\'' +
                ", loanAmount=" + loanAmount +
                ", duration=" + duration +
                '}';
    }
}
