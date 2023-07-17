package examples;

    // Abstract class
    abstract class Animal1 {
        // Abstract method (does not have a body)
        public abstract void animalSound1();
        // Regular method
        public void sleep() {
            System.out.println("Zzzz");
        }
    }

    // Subclass (inherit from Animal)
    class Cow1 extends Animal1 {
        public void animalSound1() {
            // The body of animalSound() is provided here
            System.out.println("The cow says: Moo");
        }
    }

    class Abstraction {
        public static void main(String[] args) {
            Cow1 myCow = new Cow1(); // Create a Cow object
            myCow.animalSound1();
            myCow.sleep();
        }
    }

