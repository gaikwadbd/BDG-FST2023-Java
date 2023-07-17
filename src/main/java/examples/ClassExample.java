package examples;

public class ClassExample {

        int cadence = 0;
        int speed = 0;
        int gear = 1;
        void changeCadence(int newValue) {
            cadence = newValue;
        }
        void changeGear(int newValue) {
            gear = newValue;
        }
        void speedUp(int increment) {
            speed = speed + increment;
        }
        void applyBrakes(int decrement) {
            speed = speed - decrement;
        }
        void printStates() {
            System.out.println("cadence:" + cadence + " speed:" + speed + " gear:" + gear);
        }

    public static void main(String[] args) {
        ClassExample obj=new ClassExample();
        obj.applyBrakes(10);
        obj.changeCadence(5);
        obj.changeGear(4);
        obj.speedUp(200);
        obj.printStates();
    }
    }
