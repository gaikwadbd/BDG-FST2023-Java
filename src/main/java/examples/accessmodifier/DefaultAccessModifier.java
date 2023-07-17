package examples.accessmodifier;

public class DefaultAccessModifier {
         void msg ()
        {
            System.out.println ("Hello World");
        }
    }

class DefaultAccessModifierTest {
    public static void main(String args[]) {
        //Accessing class Demo1 from package A
        DefaultAccessModifier obj = new DefaultAccessModifier(); //Compile Time Error
        obj.msg();  //Compile Time Error
    }
}

//This will give compile time error
//Java: class DefaultAccessModifierTest is public, should be declared in a file named DefaultAccessModifierTest.java