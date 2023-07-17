package examples.aggregation;

//class College
class College
{
    private String name;
    // College name
    College (String name)
    {
        this.name = name;
    }
    public String getCollegeName ()
    {
        return this.name;
    }
}
//Student class
class Student
{
    private String name;
    // student name
    Student (String name)
    {
        this.name = name;
    }
    public String getStudentName ()
    {
        return this.name;
    }
}
//Association between both the
//classes in main method
public class AssiciationClassTest
{
    public static void main (String[]args)
    {
        College college = new College ("Fergusson College Pune");
        Student s = new Student ("Bharat");
        System.out.println (s.getStudentName () + " is student of " +college.getCollegeName ());
    }
}
