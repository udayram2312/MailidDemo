package creditcarddemo;

public class CardServiceTest {

    public static void main(String[] args){
        Address address = new Address();
        address.area = "kphb";
        address.steetNo = "5";
        address.flatNo = "6-45";
        address.pincode = "500072";

        User user = new User();
        user.name = "uday";
        user.dob = "23/12/1998";
        user.mobileNo = "7496418141";
        user.adhar = "759946824564";
        user.pan = "SBIN0004896";
        user.address = address;

        CardService cardservice = new CardService();
        System.out.println(cardservice.card(user));



    }
}
