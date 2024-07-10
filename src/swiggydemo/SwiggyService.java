package swiggydemo;

import java.util.ArrayList;
import java.util.List;

public class SwiggyService {

    public void orderProcess(){
        Swiggy swiggy = new Swiggy();

        Dish dish1 = new Dish("chicken","120","4");
        Dish dish2 = new Dish("mutton","350","4.5");
        Dish dish3 = new Dish("fish","200","4.2");

        Address address1 = new Address("addagutta","2-56","500047","jntu");
        Restuarant restuarant1 = new Restuarant("mephil","5",address1);

        Address address2 = new Address("hafezpet","2-489","569887","kphb");
        Restuarant restuarant2 = new Restuarant("pistahouse","4.5",address2);

        restuarant1.dishList.add(dish1);
        restuarant1.dishList.add(dish2);
        restuarant1.dishList.add(dish3);

        restuarant2.dishList.add(dish1);
        restuarant2.dishList.add(dish2);
        restuarant2.dishList.add(dish3);

        swiggy.restuarants.add(restuarant1);
        swiggy.restuarants.add(restuarant2);

    }
}
