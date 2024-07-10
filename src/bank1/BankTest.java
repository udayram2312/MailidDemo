package bank1;

import java.util.Date;

public class BankTest {
    public static void main(String[] args) {
        Account account = new Account();
        account.accountNo = "15642";
        account.balance = 5000;
        account.ifscCode = "SBIN000589";
        account.password = "5964";
        account.userName = "ram";

        Card card = new Card();
        card.cardNo = "78944552";
        card.cvvNo = "5566";
        card.expiryDate = new Date();
        card.account = account;

        ATM atm = new ATM();
        atm.atmId = "4599875245";
        atm.balance = 75664;
        atm.location = "jntu";

        Transaction transaction = new Transaction();
        transaction.atm = atm;
        transaction.transactionId = "7955623";
        transaction.card = card;
        transaction.withdrawAmount = 5567;
        



    }
}
