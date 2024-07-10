package swiggydemo;

import java.util.List;
import java.util.function.Predicate;

public class DishService {

    public Dish findDish(Restuarant restuarant,String dishName) throws CheckedException {
        if (restuarant != null) {
            Predicate<Dish> dishPredicate = dish -> dish.getName().equalsIgnoreCase(dishName);
            return restuarant.getDishList().stream().filter(dishPredicate).findFirst().orElse(null);
        } else {
            throw new CheckedException(ErrorCodes.DISH_NOT_FOUND.getCode(), ErrorCodes.DISH_NOT_FOUND.getMessage());
        }

    }

}







