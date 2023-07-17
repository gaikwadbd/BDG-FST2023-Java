package examples.polymorphism;

public class HumanDynamicBindingTest {
    //Overridden Method
    public void walk()
    {
        System.out.println("Run time Polymorphism:Human walks");
    }
}
class BoyDynamicBindingTest extends HumanDynamicBindingTest{
    //Overriding Method
    public void walk(){
        System.out.println("Run time Polymorphism:Boy walks");
    }
    public static void main( String args[]) {
        // Reference is of Human type and object is Boy type

        HumanDynamicBindingTest obj = new BoyDynamicBindingTest();
        // Reference is of Human type and object is of Human type.

        HumanDynamicBindingTest obj2 = new HumanDynamicBindingTest();
        obj.walk();
        obj2.walk();
    }
}
