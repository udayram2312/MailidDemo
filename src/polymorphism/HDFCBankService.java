package polymorphism;

public class HDFCBankService extends RBIBankService{

    public double calculateIntrest(int principalamount){
        double totalAmount = 0;
        double intrestAmount = super.calculateIntrest(principalamount);
        totalAmount = intrestAmount + principalamount;
        return totalAmount;
    }
    public double calculateIntrest(int principalAmount,int days){
        double totalAmount = 0;
        if (days > 89){
           return this.calculateIntrest(principalAmount);
        }
        return totalAmount + principalAmount;
    }
}
