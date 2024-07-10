package swiggy1;

public class Order {

   // public OrderItem orderItem;
    public String orderId;
    public int price;
   public Address address;
  //  public String orderDate;

    public OrderItem orderItem;

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", price=" + price +
                ", address=" + address +
                ", orderItem=" + orderItem +
                '}';
    }
}
