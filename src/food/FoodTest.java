package food;

public class FoodTest {
    public static void main(String[] args) {
        FoodItems food = new FoodItems();
        food.rice = "Zeera Rice";
        food.curry = "Brinjal";
        Family family = new Family("uday", "srinivas", "vijaya laxmi", "swapna", food);
        System.out.println("HomeFood" + family);
        Family family1 = new Family("uday", "srinivas", "vijaya laxmi", "swapna");
        System.out.println("outside Food" + family1);

    }


    }

