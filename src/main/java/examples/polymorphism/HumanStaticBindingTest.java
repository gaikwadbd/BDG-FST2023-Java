package examples.polymorphism;

public class HumanStaticBindingTest {
    public static void walk() {
        System.out.println("Human walks");
    }
}
class BoyStaticBindingTest extends HumanStaticBindingTest{
    public static void walk(){
        System.out.println("Boy walks");
    }
    public static void main( String args[]) {
        // Reference is of Human type and object is Boy type
        HumanStaticBindingTest obj = new BoyStaticBindingTest();
        // Reference is of Human type and object is of Human type.

        HumanStaticBindingTest obj2 = new HumanStaticBindingTest();
        obj.walk();
        obj2.walk();
    }
}

