package swiggydemo1.service;

import swiggydemo1.model.Menu;
import swiggydemo1.model.Otp;
import swiggydemo1.model.Restaurant;
import swiggydemo1.model.User;

import javax.imageio.stream.ImageInputStream;

public class SwiggyTest {

    public static void main(String[] args){
          User user = new User();
          user.mobileNumber = "994568789";
          user.name = "uday";

        Restaurant restaurant = new Restaurant();
        Menu menu = new Menu();
        restaurant.name = "mephil";
        restaurant.area = "kphb";
        restaurant.city = "hyd";
        restaurant.flatNo = "2-56";
        restaurant.streetNo = "4";
        restaurant.pinCode = 500072;
        restaurant.user = user;

        menu.name = "biryani";
        menu.price = 200;
        menu.status ="good";

        restaurant.menu = menu;

        SwiggyService swiggyService = new SwiggyService();

        Otp r1 =swiggyService.registerRestaurant(restaurant);

        System .out.println(r1);

      String responce = swiggyService.validateOtp(r1,restaurant.user );

        System.out.println(responce);




    }
}
