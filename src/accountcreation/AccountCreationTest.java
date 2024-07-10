package accountcreation;

public class AccountCreationTest {

    public static void main(String[] args) {
        User user = new User();
        Address userAddress = new Address();
        userAddress.area = "kphb";
        userAddress.country = "india";
        userAddress.flatNo = "5-70";
        userAddress.pincode = "500072";

        user.firstName = "uday";
        user.lastname = "ram";
        user.dob = "23/12/1998";
        user.mobileNo = "964874587";
        user.adhar = "7458691545";
        user.pan = "GHTO9673";

    }
}
