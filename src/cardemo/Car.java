package cardemo;

public class Car {

    private  String colour;//String will be the replaces class
    private  String dashBoard;
    private String wheel;
    private String engine;


    public Car(String colour, String dashBoard, String wheel, String engine) {
        this.colour = colour;
        this.dashBoard = dashBoard;
        this.wheel = wheel;
    }

    public String getColour() {
        return colour;
    }

    public String getDashBoard() {
        return dashBoard;
    }

    public String getWheel() {
        return wheel;
    }

    public String getEngine() {
        return engine;
    }
}
