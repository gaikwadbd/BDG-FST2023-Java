package examples.polymorphism;

public class PloymorphismTest {

        //char first, int second
        public void disp(char c,int a) {
                 System.out.println("First definition of method disp");

         }

        //int first, char second
        public void disp(String a) {
            System.out.println("Second definition of method disp" );
        }

    public static void main(String[] args) {
        PloymorphismTest obj =new PloymorphismTest();
        obj.disp("Bharat");

    }
    }
