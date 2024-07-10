package computer;

public class Monitor {
    public  String display;
    public String camera;

    public Monitor(String display, String camera) {
        this.display = display;
        this.camera = camera;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "display='" + display + '\'' +
                ", camera='" + camera + '\'' +
                '}';
    }
}
