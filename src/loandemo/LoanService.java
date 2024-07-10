package loandemo;

public class LoanService {

    public LoanDetails loan(LoanInputs loanInputs){
        LoanDetails loanDetails = new LoanDetails();

        loanDetails.holderName = loanInputs.holderName; ;
        loanDetails.accountNo = loanInputs.accountNo;
        loanDetails.loanAmount = 200000;
        loanDetails.intrest = 0.3;
        loanDetails.duration = 12;
        return  loanDetails;

    }
}
