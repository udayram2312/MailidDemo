package swiggy;

import swiggy.Model.PaymentRequest;
import swiggy.Model.PaymentResponce;

 public interface SwiggyPaymentService {


    PaymentResponce Payment(PaymentRequest request);


}
