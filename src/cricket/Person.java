package cricket;

public class Person {
    private String name;
    private int rollNo;
    public String getName(){
        return name;
    }
    public  int getRollNo(){
        return rollNo;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setRollNo(int rollNo){
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }
}

