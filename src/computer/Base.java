package computer;

public class Base {
    public String keyBoard;
    public String processor;
    public String fan;
    public String battery;
    Monitor  monitor;
    long number = 1234567874;
    


    @Override
    public String toString() {
        return "Base{" +
                "keyBoard='" + keyBoard + '\'' +
                ", processor='" + processor + '\'' +
                ", fan='" + fan + '\'' +
                ", battery='" + battery + '\'' +
                ", monitor=" + monitor +
                '}';
    }
}
//    public static void main(String[] args) {
//        Base base = new Base();
//        base.battery = "lenova";
//        base.processor = "processor";
//        base.fan = "ganga";
//        System.out.println(base.battery);
//
//
//    }







