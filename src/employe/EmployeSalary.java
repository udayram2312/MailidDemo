package employe;

public class EmployeSalary extends EmployeDetails{
    public int hours;
    public int salary;

    public EmployeSalary(String name, int id, String companyName, int hours,int salary) {
        super(name, id, companyName);
        this.hours = hours;
        this.salary = salary;
    }
    public String CalculateSalary(String name,int id,String companyName) {
        return name + id + companyName;

    }

    public int getHours() {
        return hours;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "EmployeSalary{" +
                "hours=" + hours +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int calculateSalary() {
        return hours*salary;
    }
}

