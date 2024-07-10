package swiggydemo;

import java.util.ArrayList;
import java.util.List;

public class Restuarant {
    public String name;
    public String rating;
    public Address address;
    List<Dish>  dishList=new ArrayList<>();

    @Override
    public String toString() {
        return "Restuarant{" +
                "name='" + name + '\'' +
                ", rating='" + rating + '\'' +
                ", address=" + address +
                ", dishList=" + dishList +
                '}';
    }

    public Restuarant(String name, String rating, Address address){
        this.name = name;
        this.rating = rating;
        this.address = address;

    }

    public String getName() {
        return name;
    }

    public List<Dish> getDishList() {
        return dishList;
    }


}
