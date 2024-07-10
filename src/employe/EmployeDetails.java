package employe;

public abstract class EmployeDetails {

    public String name;
    public int id;
    public String companyName;

    public EmployeDetails(String name,int id,String companyName){
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
    public String EmployeDetails(String name,int id,String companyName){
        return (name+id+companyName);
    }
    public abstract int calculateSalary();
}
