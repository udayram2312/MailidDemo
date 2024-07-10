package zomato;

public class ZomatoTest {
    public static void main(String[] args) {
        PhonePe phonePe = new PhonePe();
        Process process = new Process();
        process.OrderProcess("fish","butterscoch","thumpsup");
        phonePe.paymentProcess(process);

    }
}
