package loandemo;

public class LoanTest {

    public static void main(String[] args){
        LoanInputs loanInputs = new LoanInputs();
        Surety surety = new Surety();
        surety.suretyName = "srinivas";

        loanInputs.holderName = "uday";
        loanInputs.accountNo = "125978897";
        loanInputs.surety = surety;

        LoanService loanService = new LoanService();
        LoanDetails loanDetails = loanService.loan(loanInputs);

       // System.out.println(loanDetails.loanAmount);
       // System.out.println(loanDetails.duration);
        System.out.println(loanDetails.loanAmount);
        System.out.println(loanDetails.intrest);
        System.out.println(loanDetails.duration);
        System.out.println(loanInputs.surety);
    }
}
