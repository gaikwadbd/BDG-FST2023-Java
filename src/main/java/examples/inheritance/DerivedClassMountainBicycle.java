package examples.inheritance;

//Derived class
public class DerivedClassMountainBicycle extends BaseClassBiCycle {

    //The MountainBike subclass adds one more field
    public int seatHeight;

    //The MountainBike subclass has one constructor
    public DerivedClassMountainBicycle(int gears, int speed, int originalHeight) {
        //Invoking base-class(Bicycle) constructor
        super(gears, speed);
        seatHeight = originalHeight;
    }

    // the MountainBike subclass adds one more method
    public void setHeight(int adjustedHeight) {
        seatHeight = adjustedHeight;
    }

    public String bicycleDesc() {
        return (super.bicycleDesc()+ "\nSeat height is " + seatHeight);
    }
}
