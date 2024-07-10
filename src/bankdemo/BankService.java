package bankdemo;

public class BankService {

    public Passbook createAccount(Bank bank){
        Passbook passbook = new Passbook();
        passbook.accountNo = "55655325663";
        passbook.ifscCode = "SBIN0007956";
        passbook.balance = "10000";
        return  passbook;


    }


}
