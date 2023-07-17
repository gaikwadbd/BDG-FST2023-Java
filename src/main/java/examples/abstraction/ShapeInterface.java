package examples.abstraction;

public interface ShapeInterface {
          public double Area();
        public double Volume();
    }

class Cube implements ShapeInterface
{
    int x = 10;
    public double Area ()
    {
        return (6 * x * x);
    }
    public double Volume ()
    {
        return (x * x * x);
    }
}
class Circle1 implements ShapeInterface
{
    int radious = 10;
    public double Area ()
    {
        return (Math.PI * radious * radious);
    }
    public double Volume ()
    {
        return 0;
    }
}