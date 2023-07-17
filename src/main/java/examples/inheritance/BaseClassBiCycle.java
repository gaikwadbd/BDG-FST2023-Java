package examples.inheritance;

public class BaseClassBiCycle implements BiCycleParts,BiCycleOperations {
    public int gears;
    public int speed;

    //the Bicycle class has one constructor
    public BaseClassBiCycle(int gears, int speed) {
        this.gears = gears;
        this.speed = speed;


    }

    @Override
    public void applyBrake(int reduceSpeed) {
        speed -= reduceSpeed;
        System.out.println("Bicycle speed is Reduced current speed: " + speed);
    }

    @Override
    public void putGearAndSpeedUp(int increaseSpeed) {
        speed += increaseSpeed;
        System.out.println("Bicycle speed is Increased current speed: " + speed);
    }
    //Method to print info of Bicycle
    public String bicycleDesc() {
        return("Bicycle's No of gears are: "+ gears + "\nSpeed of bicycle is: " + speed);
    }
}
