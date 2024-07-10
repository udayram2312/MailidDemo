package amazon;

public class AmazonPayment {
    MyMoney myMoney = new MyMoney();
    AmazonOrders amazonOrders = new AmazonOrders();
    AmazonLogin amazonLogin = new AmazonLogin();
    OrdersCheckOut ordersCheckOut = new OrdersCheckOut();

    public String amazonPayment() {
        if (myMoney.paylater >= ordersCheckOut.totalprice) {
            myMoney.paylater = myMoney.paylater - ordersCheckOut.totalprice;
            System.out.println(ordersCheckOut.totalprice);
            System.out.println(myMoney.paylater);

        }
        return "payment successful";



    }
}




