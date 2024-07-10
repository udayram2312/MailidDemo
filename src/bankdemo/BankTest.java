package bankdemo;

public class BankTest {
    public static void main(String[] args){
        Address address = new Address();
        address.area = "jntu";
        address.streetNo = "4";
        address.houseNo = "2-40";
        address.pincode = "500072";

        Bank bank = new Bank();
        bank.firstName = "uday";
        bank.lastName = "ram";
        bank.dateOfBirth = "23/12/1998";
        bank.mobileNo = "9564554241";
        bank.panNo = "DFJK0967A";
        bank.address = address;



        BankService bankService = new BankService();

        System.out.println(bankService.createAccount(bank));


    }
}
