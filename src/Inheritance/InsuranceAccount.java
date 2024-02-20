package Inheritance;

public class InsuranceAccount extends RetailAccount {
    public InsuranceAccount(String accountNumber, int balance, boolean status, int minimumBalance, int limit) {
        super(accountNumber, balance, status,minimumBalance,limit);
        this.minimumBalance = minimumBalance;
        this.limit = limit;
    }

}
