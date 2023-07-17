package examples.abstraction;
public class EmployeePermanent extends Employee {
    public EmployeePermanent(String name, int paymentPerHour) {
        super(name, paymentPerHour);
    }
    @Override
    public int calculateSalary() {
        return getPaymentPerHour() * 8;
    }
}