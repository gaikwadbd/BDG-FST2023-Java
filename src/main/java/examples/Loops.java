package examples;

public class Loops {
    public static void main(String[] args) {
        // for loop begins when x=0
        // and runs till x <=10
        for (int x = 0; x <= 10; x++) {
            System.out.println("Value of x:" + x );
        }
        System.out.println("****Enhanced For loop******");
        String[] array = {"Ron", "Harry", "Hermoine", "Ralph", "Dome"};
        //enhanced for loop
        for (String arrElement : array) {
            System.out.println(arrElement);
        }
        System.out.println("****While Loop Demo******");
        int x = 1;
        while (x <= 4) {
            System.out.println("Value of x:" + x);

            // Increment the value of x for
            // next iteration
            x++;
        }
        System.out.println("****** Do while loop demo ******");
        int y = 50;
        do {
            // The line will be printed even
            // if the condition is false
            System.out.println("Value of y:" + y);
            y--;
        }
        while (y > 20);
    }
}
