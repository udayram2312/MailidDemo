package staticdemoname;

public class StaticDemo {
    public static String i = "laxmi";
    public String j = "srinivas";

    public static void main(String[] args) {
        StaticDemo staticDemo = new StaticDemo();
        System.out.println(" static " + staticDemo.i);
        System.out.println(" instance " + staticDemo.j);

        StaticDemo.i = "uday";
        staticDemo.j = "ram";
        System.out.println(" static "+staticDemo.i);
        System.out.println(" instance "+staticDemo.j);
        StaticDemo staticDemo1 = new StaticDemo();
        System.out.println(" static "+staticDemo.i);
        System.out.println(" instance "+staticDemo.j);

        StaticDemo.i = "mintu";
        staticDemo.j = "dimple";
        System.out.println(" static "+staticDemo.i);
        System.out.println(" instance "+staticDemo.j);
        StaticDemo staticDemo2 = new StaticDemo();
        System.out.println(" static "+staticDemo.i);
        System.out.println(" instance "+staticDemo.j);
        StaticDemo.i = "swapna";
        staticDemo.j = "anil";
        System.out.println(" static "+staticDemo.i);
        System.out.println(" static "+staticDemo.j);
        StaticDemo staticDemo3 = new StaticDemo();
        System.out.println(" static "+staticDemo.i);
        System.out.println(" instance "+staticDemo.j);




    }
}