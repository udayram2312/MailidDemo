package intrest;

public class MoneyIntrest {
    public static void main(String[] args){
        MoneyGiven u1 = new MoneyGiven(100000,12,0.03);
        MoneyGiven v1 = new MoneyGiven(200000,10,0.03);
        double u1price = u1.Money + (u1.Money * u1.Months * u1.Intrest);
double v1price = v1.Money + (v1.Money * v1.Months * v1.Intrest);
double total = u1price+v1price;
System.out.println( "Udayram amount" +"= " + u1price);
System.out.println(v1price);
System.out.println(total);



        }

    }

