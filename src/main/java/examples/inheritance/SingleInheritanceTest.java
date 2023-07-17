package examples.inheritance;
class CalculateSumClass
{
    int returnSum (int i, int j)
    {
        return i + j;
    }
}
class DisplaySum extends CalculateSumClass{
    void display ()
    {
        int result = returnSum (50, 100);
        System.out.println (result);
    }
}
public class SingleInheritanceTest
{
    public static void main (String args[])
    {
        DisplaySum disSum = new DisplaySum ();
        disSum.display();
        disSum = null;
    }
}
