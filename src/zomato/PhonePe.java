package zomato;

public class PhonePe  {
   // public PhonePe(String biryani, String iceCream, String coolDrink) {
      //  super(biryani, iceCream, coolDrink);
      // int Localbalance = 1000;
    //}
    int localBalance = 1000;
    int remainingBalance;
   public String paymentProcess(Process process){
       if (localBalance >= process.totalCost) {
           remainingBalance = localBalance - process.totalCost;
           System.out.println(remainingBalance);
       }else{
           System.out.println("insufficient funds");
       }
       return " ";
   }
}

