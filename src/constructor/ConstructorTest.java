package constructor;

public class ConstructorTest {
    public static void main(String[] args){
        Address address = new Address();
        address.city = "jntu";
        address.state = "TG";
        address.country = "india";
        address.pinCode = "500090";
        Student student = new Student("uday","srinivas","23/12/1998","9948241921",address);
        System.out.println("joiningStudent="+student);

        Student examStudent = new Student("uday","srinivas",
                "23/12/1998","9948241921");
        System.out.println("examStudent="+examStudent);

    }
}
