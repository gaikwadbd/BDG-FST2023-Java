package examples.encapsulation;

public class EncapsulationDemoTest {

    // private variables declared these can only be accessed by public methods of class
    private String Name;
    private int RollNo;
    private int Age;
    // get method for age to access
    // private variable Age
    public int getAge ()
    {
        return Age;
    }
    // get method for name to access
    // private variable Name
    public String getName ()
    {
        return Name;
    }
    // get method for roll to access
    // private variable RollNo
    public int getRoll ()
    {
        return RollNo;
    }
    // set method for age to access
    // private variable Age
    public void setAge (int newAge)
    {
        Age = newAge;
    }
    // set method for name to access
    // private variable Name
    public void setName (String newName)
    {
        Name = newName;
    }
    // set method for roll to access
    // private variable RollNo
    public void setRoll (int newRollNo)
    {
        RollNo = newRollNo;
    }

    public static void main (String[]args)
    {
        EncapsulationDemoTest obj = new EncapsulationDemoTest ();
        // setting values of the variables
        obj.setName ("Bharat");
        obj.setAge (50);
        obj.setRoll (200001);
        // Displaying values of the variables
        System.out.println ("Student's Name: " + obj.getName ());
        System.out.println ("Student's Age: " + obj.getAge ());
        System.out.println ("Student's RollNo: " + obj.getRoll ());
    }
}

