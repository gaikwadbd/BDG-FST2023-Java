package examples;

import java.util.Random;

public class RandomDemo {
    public static void main( String args[] ) {
        // create random object
        Random randomno = new Random();
        Random randomno1 = new Random();

        // check next int value

       // check next int value
    System.out.println("Next int value: " + randomno1.nextInt());
    System.out.println("Next int value: " + randomno.nextInt(5));
    }
}