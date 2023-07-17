package examples.encapsulation;

public class EncapsulationTest{
    public static void main(String args[]){
        Encapsulation obj = new Encapsulation();
        obj.setEmpName("Bharat");
        obj.setEmpAge(50);
        obj.setEmpSSN(2007005);
        System.out.println("Employee Name: " + obj.getEmpName());
        System.out.println("Employee SSN: " + obj.getEmpSSN());
        System.out.println("Employee Age: " + obj.getEmpAge());
    }
}