package bank;

public class SBIBankService extends RBIBankService {
    int person = 600;
    int person1 = 400;



    public SBIBankService(int sbiAmount, int hdfcAmount, int person, int person1) {
        super(sbiAmount, hdfcAmount);
        this.person = person;
        this.person1 = person1;
    }
}
