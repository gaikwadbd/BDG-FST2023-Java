package examples.polymorphism;

public class StaticBindingTest {
    public static class ParentClass
    {
        static void print ()
        {
            //print in superclass
            System.out.println ("Hi! This is parent class");
        }
    }
    public static class ChildClass extends ParentClass
    {
        static void print ()
        {
            //print in subclass
            System.out.println ("Hello! This is child class");
        }
    }
    public static void main (String[]args)
    {
        ParentClass A = new ParentClass ();
        ParentClass B = new ChildClass ();
        A.print ();
        B.print ();
    }
}

