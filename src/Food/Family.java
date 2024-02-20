package Food;

public class Family {
    public String name;
    public String fatherName;
    public String motherName;
    public String sisterName;
    public FoodItems food;
    public Family(String name,String fatherName,String motherName,String sisterName,FoodItems food){
        this.name = name;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.sisterName = sisterName;
        this.food = food;
    }

    @Override
    public String toString() {
        return "Family{" +
                "name='" + name + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", motherName='" + motherName + '\'' +
                ", sisterName='" + sisterName + '\'' +
                ", food=" + food +
                '}';
    }

    public  Family(String name, String fatherName, String motherName, String sisterName) {
    this(name, fatherName, motherName, sisterName, new FoodItems());
}


    }







