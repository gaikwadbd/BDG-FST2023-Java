package examples.accessmodifier;

public class PrivateAccessModifierTest {
    public static void main(String args[]) {
        PrivateAccessModifier obj = new PrivateAccessModifier();
        System.out.println(obj.num); //compile time error
        System.out.println(obj.square(10)); //compile time error
    }
}
