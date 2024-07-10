package computer;

public class Test {
    public static Monitor getmonitor(){
        Monitor monitor = new Monitor("hd","16");
        monitor.camera="computer";
        monitor.display = "system";
        return monitor;
    }
    public static void main(String[] args){
      //  Test test = new Test();
//        Base base = new Base();


        System.out.println(getmonitor().camera);
        System.out.println(getmonitor().toString());
//        System.out.println(test);
    }
}
