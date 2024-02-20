package Amazon;

public class AmazonTest {
   public static void main (String[] args) {
        AmazonLogin amazonLogin = new AmazonLogin();
        AmazonOrders amazonOrders = new AmazonOrders();
        //Amazon.Product product = new Amazon.Product();
        OrdersCheckOut ordersCheckOut = new OrdersCheckOut();
        MyMoney myMoney = new MyMoney();
        AmazonPayment amazonPayment = new AmazonPayment();
        boolean login = amazonOrders.login(amazonLogin);
        if (login){
            String status = amazonPayment.amazonPayment();
            System.out.println(status);
        }

        }


    }

