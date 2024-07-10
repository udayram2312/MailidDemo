package swiggy1;

public class SwiggyTest {

    public static void main(String[] args){
        Address address = new Address();
        address.area = "kphb";
        address.street = "5";
        address.houseNo = "2-50";

        Product product = new Product();
        product.productName = "biryani";
        product.productPrice = 400;
        product.vendor = "mephil";

        OrderItem orderItem = new OrderItem();
        orderItem.product = product;
        orderItem.price = 400;
        orderItem.quantity = 4;

        Order order = new Order();
        order.orderId = "231921";
        order.orderItem = orderItem;
        order.price = 200;
        order.address = address;

        System.out.println(orderItem.product.productName);


    }
}
