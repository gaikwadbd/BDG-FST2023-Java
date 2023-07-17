package examples.inheritance;
//Driver class
public class BiCycleInheritanceTest {
         public static void main(String args[]) {
            DerivedClassMountainBicycle mb = new DerivedClassMountainBicycle(2, 10, 50);
            System.out.println(mb.bicycleDesc());
            mb.putGearAndSpeedUp(100);
            mb.applyBrake(5);
        }
    }
