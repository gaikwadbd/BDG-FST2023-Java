package examples.abstraction;

public class EmployeeContractor extends Employee {
    private int workingHours;

    //Create Constructor
    public EmployeeContractor(String name, int paymentPerHour, int workingHours) {
        super(name, paymentPerHour);
        this.workingHours = workingHours;
    }
    @Override
    public int calculateSalary() {
        return getPaymentPerHour() * workingHours;
    }
}