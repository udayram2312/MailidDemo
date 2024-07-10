package loandemo;

public class LoanInputs {
    public String holderName;
    public String accountNo;
    public Surety surety;

    @Override
    public String toString() {
        return "LoanInputs{" +
                "holderName='" + holderName + '\'' +
                ", accountNo='" + accountNo + '\'' +
                ", surety=" + surety +
                '}';
    }
}
