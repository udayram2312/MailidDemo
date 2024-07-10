package swiggy;

import swiggy.Model.PaymentRequest;
import swiggy.Model.PaymentResponce;

import java.util.UUID;

public class PhonepayService implements SwiggyPaymentService {
    @Override
    public PaymentResponce Payment(PaymentRequest request) {
        PaymentRequest paymentInitationRequest =
                new PaymentRequest("SWIGGY"+ UUID.randomUUID().toString()
                        ,request.getAmount(),request.getTxnDate(),"5555",false);



    SBIBankService sbiBankService = new SBIBankService();

    return sbiBankService.transfer(paymentInitationRequest);


    }

}
