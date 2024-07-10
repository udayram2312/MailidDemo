package amazon;

public class AmazonOrders {
    boolean login(AmazonLogin Details) {
        String Mail = "ram@gamil.com";
        String Password = "ram@123";
        if (Mail.equals(Details.Mail) && Password.equals(Details.Password)) {
            return true;
        } else {
            return false;
        }

    }
}