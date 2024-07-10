package familydemo;

public class TreeDemoTest {
    public static void main(String[] args) {

        //here iam creating object
        Family test = new Family();
        //here iam creating object
        test = new Family();
        //iam assign the new object to test ref so the above object is eligible for garbage collection
        test = new Family();
        test = new Family();
        test.name = "A";
        Family ref = test;
        Family ref1 = test;

        ref1.name = "B";
        Family ref2 = test;
        Family a = new Family();
        a.name = "A";

        Family b = new Family();
        b.name = "B";
        a = new Family();
        test = a;
        System.out.println(ref2.name);
        System.out.println(ref.name);

    }
}