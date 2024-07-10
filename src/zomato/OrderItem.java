package zomato;

public abstract class OrderItem {
    public String biryani;
    public String iceCream;
    public String coolDrink;


    public abstract String OrderProcess(String biryani, String icecream, String coolDrink) ;

}
