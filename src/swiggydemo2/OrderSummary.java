package swiggydemo2;

public class OrderSummary {

    private String id;
    private double serviceCharge;

    public Order order;

    public OrderSummary(Order order) {
        //this(order,10);
    }

    public OrderSummary(String id, double serviceCharge, Order order) {
        this.id = id;
        //this.serviceCharge = (order.getOrder)  serviceCharge;
        this.order = order;
    }
}
