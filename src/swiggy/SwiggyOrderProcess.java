package swiggy;

import swiggy.Model.Order;
import swiggy.Model.PaymentRequest;
import swiggy.Model.PaymentResponce;

import java.util.Date;
import java.util.UUID;

public abstract class SwiggyOrderProcess {

    SwiggyPaymentService swiggyPaymentService;
    public SwiggyOrderProcess(SwiggyPaymentService swiggyPaymentService) {
        this.swiggyPaymentService = swiggyPaymentService;
    }

    public Order getFinalOrder(Order order) {
        double tax = 0;

        if (order.getPrice() > 1000) {
             tax = order.getPrice() * 20 / 100;
        }

        double finalAmount = order.getPrice() + tax + 20;
        Order finalOrder = new Order(finalAmount, tax, 20);
        finalOrder.setOrderItemList(order.getOrderItemList());
        return finalOrder;
    }
    public Order createOrder(Order order) {
        Order finalOrder = getFinalOrder(order);
        PaymentRequest paymentInitationRequest = new PaymentRequest("swiggy" + UUID.randomUUID().toString(),
                finalOrder.getPrice(), new Date(), "5555", false);
        PaymentResponce responce = swiggyPaymentService.Payment(paymentInitationRequest);

        if (responce != null){
            finalOrder.setStatus("Success");
            System.out.println(responce.getCorelationId());
        }

        delivary(finalOrder);
        return finalOrder;
    }
    public abstract boolean delivary(Order order);



    }

