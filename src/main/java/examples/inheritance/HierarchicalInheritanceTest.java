package examples.inheritance;

class ClassHello
{
    public void printHello()
    {
        System.out.println("Hello");
    }
}

class ClassWorld extends ClassHello
{
    public void printWorld()
    {
        System.out.println("World");
    }
}

class ClassJavaWorld extends ClassHello
{
    public void printHelloJavaWorld() {
        System.out.println("Hello Java World");
    }
}

// Drived class
public class HierarchicalInheritanceTest
{
    public static void main(String[] args)
    {
        ClassJavaWorld Objjavaworld = new ClassJavaWorld();
        Objjavaworld.printHello();
        ClassWorld Objworld = new ClassWorld();
        Objworld.printWorld();
        Objjavaworld.printHelloJavaWorld();
        Objworld.printHello();
    }
}
