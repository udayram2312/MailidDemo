package accountcreation;

public class AccountService {
    public Passbook createAccount(User user){
        Passbook passbook = new Passbook();
        Address address = new Address();

        address.area = "kphb";
        address.country = "india";
        address.flatNo = "5-70";
        address.pincode = "500072";

        return  passbook;





    }
}
