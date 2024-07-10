package bank;

public class HDFCBankService extends RBIBankService{

    int person = 200;
    int person1 = 500;

    public HDFCBankService(int sbiAmount, int hdfcAmount, int person, int person1) {
        super(sbiAmount, hdfcAmount);
        this.person = person;
        this.person1 = person1;

    }
}
