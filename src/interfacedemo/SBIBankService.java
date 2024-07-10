package interfacedemo;

public class SBIBankService implements RBIBankService{

    @Override
    public String transfer(String fromAccountNumber, String toAccountNumber, int amount) {
        return "transfer from SBIBank";
    }
}
