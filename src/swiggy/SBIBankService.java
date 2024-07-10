package swiggy;

import swiggy.Model.PaymentRequest;
import swiggy.Model.PaymentResponce;

import java.util.Date;
import java.util.UUID;

public class SBIBankService {


    private String accountNUmber = "1234";
    private double amount = 5000;

    private String merchantAccountNumber = "5555";

    private double merchantAmount = 1000;


    public PaymentResponce transfer(PaymentRequest request){
        System.out.println(request.getTxId());


        if(request.isMerchantDebit()) {
            merchantAmount = merchantAmount - request.getAmount();
            amount = amount + request.getAmount();
        }else {
            amount = amount - request.getAmount();
            merchantAmount = merchantAmount + request.getAmount();
        }

     PaymentResponce responce = new PaymentResponce(UUID.randomUUID().toString(),"Success",new Date());

        return responce;

    }
}
