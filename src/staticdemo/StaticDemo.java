package staticdemo;

public class StaticDemo {

    public static int i = 20;

    public int j = 30;
    public static String helloWorld(){
        return"HelloWorld";
    }
    public String hi(){
       return "hi";

    }

    public static void main(String[] args) {
        StaticDemo staticDemo = new StaticDemo();

        System.out.println("Static"+staticDemo.i);
        System.out.println("Instance"+staticDemo.j);
        StaticDemo.i = 100;
        staticDemo.j = 100;
        System.out.println("Static"+StaticDemo.i);
        System.out.println("Instance"+staticDemo.j);
        StaticDemo staticDemo1 = new StaticDemo();
        System.out.println("Static"+StaticDemo.i);
        System.out.println("Instance"+staticDemo.j);
        StaticDemo.i = 200;
        staticDemo.j= 200;
        System.out.println("Static"+StaticDemo.i);
        System.out.println("Instance"+staticDemo.j);
        StaticDemo staticDemo2 = new StaticDemo();
        System.out.println("Static"+StaticDemo.i);
        System.out.println("Instance"+staticDemo.j);
        StaticDemo.i = 300;
        staticDemo.j = 300;
        System.out.println("Static"+StaticDemo.i);
        System.out.println("Instance"+staticDemo.j);
        StaticDemo staticDemo3 = new StaticDemo();
        System.out.println("Static"+StaticDemo.i);
        System.out.println("Instance"+staticDemo.j);


    }
}
