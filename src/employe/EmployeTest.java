package employe;

public class EmployeTest {
    public static void main(String[] args) {
        EmployeSalary employeSalary = new EmployeSalary("uday",23,"tcs",20,20000);
        System.out.println(employeSalary.EmployeDetails("uday",23,"tcs"));
        System.out.println(employeSalary.calculateSalary());

        }

    }

