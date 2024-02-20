package Inheritance;

public class RetailAccount extends Account {
    public int minimumBalance=1000;
    public int limit=500;

    @Override

    public String toString() {
        return "RetailAccount{" +
                "minimumBalance=" + minimumBalance +
                ", limit=" + limit +
                '}';
    }

    public RetailAccount(String accountNumber, int balance, boolean status, int minimumBalance, int limit) {
        super(accountNumber, balance, status);
        this.minimumBalance = minimumBalance;
        this.limit = limit;
    }

   }
