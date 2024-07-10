package employee;

public abstract class EmployeeDetails {
    public String name;
    public int id;
    public String companyName;

//public abstract double EmployeeDetails();

    public EmployeeDetails(String name,int id,String companyName) {
        this.name = name;
        this.id = id;
        this.companyName = companyName;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getCompanyName() {
        return companyName;
    }
    public String EmployeeDetails(String name,int id,String companyName){
        return name+id+companyName;
    }

    public abstract int calculateSalary();

    @Override
    public String toString() {
        return "EmployeeDetails{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}





