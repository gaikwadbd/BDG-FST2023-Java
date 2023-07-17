/***
 Author: Bharat Gaikwad
 Description: Activity1 -Access member variable and methods of class.
 Created on 05/05/2023
 **/
package activities;

public class Car {
    //Member variable of the Car
    String color;
    int make;
    String transmission;

    int tyres;
    int doors;

    // make Constructor and Initialize the variables.
    Car(){
        tyres=4;
        doors=4;

    };

    //Car class methods
    public void displayCharacteristics(){
        System.out.println("Color of the Car: " + color);
        System.out.println("Make of the Car: " + make );
        System.out.println("Transmission of the Car: " + transmission);
        System.out.println("Number of doors on the car:" + doors);
        System.out.println("Number of tyres on the car: " +tyres );
    }

    public void accelarate(){

        System.out.println("Car is moving forward.");
    }
    public void brake(){

        System.out.println("Car has stopped.");
    }
}