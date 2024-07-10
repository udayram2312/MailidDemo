package interfacedemo;

public class InterfaceDemoTest {

    public static void main(String[] args) {
        RBIBankService hdfcBankService = new HDFCBankService();
        RBIBankService sbiBankService = new SBIBankService();


 String hdfcStatus= hdfcBankService.transfer("1921","2312",10000);
    String sbiStatus= sbiBankService.transfer("9942","5656",10000);


        System.out.println(hdfcStatus);
        System.out.println(sbiStatus);

    }
}
