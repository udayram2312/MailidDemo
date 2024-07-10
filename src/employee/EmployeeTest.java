package employee;

public class EmployeeTest {
    public static void main(String[] args) {
        //EmployeeDetails employeeDetails=new EmployeeSalary("UDAY",143,"HCL",30,1000000);


        EmployeeSalary employeeSalary = new EmployeeSalary("UDAY",143,"HCL",30,1000000);
        System.out.println(employeeSalary.EmployeeDetails("Uday",143,"TCS"));
        System.out.println(employeeSalary.calculateSalary());








    }
}
