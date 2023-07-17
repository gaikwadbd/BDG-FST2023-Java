package examples.accessmodifier;

public class PublicAccessModifierTest {
    public static void main (String[]args)
    {
        // accessing the public class
        PublicAccessModifier publicAT = new PublicAccessModifier ();
        // accessing the public variable
        publicAT.legCount = 4;

        // accessing the public method
        publicAT.display ();
    }
}

