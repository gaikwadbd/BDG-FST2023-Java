package examples.abstraction;

public class ShapeInterfaceTest {
        public static void main (String[]args)
        {
            ShapeInterface s1 = (ShapeInterface) new Cube ();
            System.out.println ("The area of Cube is : " + s1.Area ());
            System.out.println ("The volume of Cube is : " + s1.Volume ());
            ShapeInterface s2 = new Circle1 ();
            System.out.println ("The area of Circle is : " + s2.Area ());
            System.out.println ("The volume of Circle is : " + s2.Volume ());
        }
    }

