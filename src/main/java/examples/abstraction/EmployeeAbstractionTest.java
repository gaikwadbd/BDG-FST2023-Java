package examples.abstraction;

public class EmployeeAbstractionTest {

    public static void main(String[] args) {

        Employee employeeContractor = new EmployeeContractor("employeeContractor", 5, 8);
        Employee employeePermanent = new EmployeePermanent("employeePermanent", 50);
        System.out.println(employeeContractor.calculateSalary());
        System.out.println(employeePermanent.calculateSalary());
    }
}