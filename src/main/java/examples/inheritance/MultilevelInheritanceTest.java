package examples.inheritance;
class ClassTestA
{
    void functionTest1 ()
    {
        System.out.println ("This is class A functionTest1()");
    }
}
class ClassTestB extends ClassTestA
{
    void functionTest2 ()
    {
        System.out.println ("This is class B functionTest2()");
    }
}
class ClassTestC extends ClassTestB
{
    void functionTest3 ()
    {
        System.out.println ("This is class C functionTest3()");
    }
}
public class MultilevelInheritanceTest
{
    public static void main (String srgs[])
    {
        ClassTestC objClassC = new ClassTestC ();
        objClassC.functionTest1 ();
        objClassC.functionTest2 ();
        objClassC.functionTest3 ();
        objClassC = null;
    }
}
