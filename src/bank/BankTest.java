package bank;

public class BankTest {
    public static void main(String[] args) {
        SBIBankService sbiBankService = new SBIBankService(5000,4000,600,400);
        HDFCBankService hdfcBankService = new HDFCBankService(5000,4000,200,500);

        System.out.println(sbiBankService.sbiAmount);
        System.out.println(hdfcBankService.hdfcAmount);

        int sbiSpent = sbiBankService.person+ sbiBankService.person1;
        int hdfcSpent = hdfcBankService.person+ hdfcBankService.person1;

        System.out.println(sbiSpent);
        System.out.println(hdfcSpent);

        if(sbiSpent>hdfcSpent){
            int pendingAmount = sbiSpent-hdfcSpent;
            System.out.println(pendingAmount);

            int newSBIAmount = sbiBankService.sbiAmount-pendingAmount;
            int newHDFCAmount = hdfcBankService.hdfcAmount+pendingAmount;
            System.out.println(newSBIAmount);
            System.out.println(newHDFCAmount);

            if(hdfcSpent<sbiSpent){
                int Amount = hdfcSpent+sbiSpent;
                System.out.println(Amount);
                int SBIAmount = sbiBankService.sbiAmount+Amount;
                int HDFCAmount = hdfcBankService.hdfcAmount-pendingAmount;
                System.out.println(SBIAmount);
                System.out.println(HDFCAmount);


            }




        }


    }

}
