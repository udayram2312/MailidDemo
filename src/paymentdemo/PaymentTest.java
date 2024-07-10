package paymentdemo;

public class PaymentTest {

    public static void main(String[] args){

        Payment payment = new Payment(1000,"9945877555");

        Account account = new Account("20694587458","7894568991");

        System.out.println(payment.getMoney());
        System.out.println(payment.getMobileNo());


    }
}
