package examples.aggregation;
class Employees
{
    String name;
    int id;
    String dept;
    Employees (String name, int id, String dept)
    {
        this.name = name;
        this.id = id;
        this.dept = dept;
        System.out.println ("Employee name is " + name + " | Id is " + id +" | Department is " + dept);
    }
}
class Department
{
    String name, employees;
    Department (String name, String employees)
    {
        this.name = name;
        this.employees = employees;
    }
}
class Organization
{
    String officeName, departments;
    Organization (String officeName, String departments)
    {
        this.officeName = officeName;
        this.departments = departments;
    }
}
public class AggregationClassTest
{
    public static void main (String[]args)
    {
        Employees s1 = new Employees ("Anika", 1, "Robotics and Machine Learning");
        Employees s2 = new Employees ("Tanaya", 2, "Artificial Intelligence");
        Employees s3 = new Employees ("Sakshi", 1, "Marketing");
        Employees s4 = new Employees ("Apurv", 2, "Cyber Security");
    }
}

