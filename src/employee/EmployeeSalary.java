package employee;

public class EmployeeSalary extends EmployeeDetails{

    public int hours;
    public int salary;

    public EmployeeSalary(String name, int id, String companyName,int hours,int salary) {
        super(name, id, companyName);
        this.hours=hours;
        this.salary=salary;
    }
    public String EmployeeDetails(String name,int id,String companyName){
        return name+id+companyName;
    }

    public int getHours() {
        return hours;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "EmployeeSalary{" +
                "hours=" + hours +
                ", salary=" + salary +
                '}';
    }


    @Override
    public int calculateSalary() {
        return hours*salary;
    }
}
