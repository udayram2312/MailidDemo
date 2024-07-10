package zomato;

public class Process {

    public int biryaniCost = 300;
    public int iceCreamCost = 100;
    public int coolDrinkCost = 30;

    public String biryani = "fish";
    public String iceCream = "butterscoch";
    public String coolDrink = "thumpsup";
    public int totalCost;

    public String OrderProcess(String biryani, String icecream, String coolDrink) {
        if (this.biryani.equals(biryani)) {
            System.out.println("biryani cost is " + biryaniCost);
        }
        if (this.iceCream.equals(icecream)) {
            System.out.println(" icecream cost is" + iceCreamCost);
        }
        if (this.coolDrink.equals(coolDrink)) {
            System.out.println(" cooldrink cost is" + coolDrinkCost);
        }
        totalCost = biryaniCost+iceCreamCost+coolDrinkCost;
        System.out.println(totalCost);
        return "select your order";

    }
    public String OrderProcess(String biryani, String icecream) {
        if (this.biryani.equals(biryani)) {
            System.out.println("biryani cost is " + biryaniCost);
        }
        if (this.iceCream.equals(icecream)) {
            System.out.println(" icecream cost is" + iceCreamCost);
        }
       // if (this.coolDrink.equals(coolDrink)) {
           // System.out.println(" cooldrink cost is" + coolDrinkCost);

        totalCost = biryaniCost+iceCreamCost;
        System.out.println(totalCost);
        return "select your order";

    }
}


