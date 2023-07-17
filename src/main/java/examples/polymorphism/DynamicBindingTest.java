package examples.polymorphism;

public class DynamicBindingTest {
          public static class ParentClass
        {
            void print ()
            {
                //print in superclass
                System.out.println ("Hi! This is from parent class");
            }
        }
        public static class childClass extends ParentClass
        {
            @Override void print ()
            {
                //print in subclass
                System.out.println ("Hello! This is from child class");
            }
        }
        public static void main (String[]args)
        {
            ParentClass A = new ParentClass ();
            ParentClass B = new childClass ();
            A.print ();
            B.print ();
        }
    }
