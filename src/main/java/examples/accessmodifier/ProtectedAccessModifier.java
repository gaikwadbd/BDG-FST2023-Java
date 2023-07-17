package examples.accessmodifier;

public class ProtectedAccessModifier {
    protected int addTwoNumbers (int a, int b)
    {
        return a + b;
    }
}

//This will give compile time error
//java: class ProtectedAccessModifierTest is public, should be declared in a file named ProtectedAccessModifierTest.java