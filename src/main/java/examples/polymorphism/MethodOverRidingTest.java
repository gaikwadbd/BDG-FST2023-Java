package examples.polymorphism;

public class MethodOverRidingTest {

    //Overridden method
    public void disp()
    {
        System.out.println("disp() method of parent class");
    }
}
class OverRiding extends MethodOverRidingTest{
    //Overriding method
    public void disp(){
        System.out.println("disp() method of Child class");
    }
    public void newMethod(){
        System.out.println("new method of child class");
    }
    public static void main( String args[]) {
        /* When Parent class reference refers to the parent class object
         * then in this case overridden method (the method of parent class)
         *  is called.
         */
        MethodOverRidingTest obj = new MethodOverRidingTest();
        obj.disp();

        /* When parent class reference refers to the child class object
         * then the overriding method (method of child class) is called.
         * This is called dynamic method dispatch and runtime polymorphism
         */
        MethodOverRidingTest obj2 = new OverRiding();
        obj2.disp();
    }
}
