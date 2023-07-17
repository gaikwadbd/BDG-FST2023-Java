package examples;

public class ArrayEx {

    public static void main(String[] args) {
        //Declaring an Array
        String [] carMake = {"BMW","AUDI","TOYOTA","SUZUKI","HONDA"};
        String [] carMake1=returnArray();
        // Calling Print_Array method and passing carMake as a parameter
        printArray(carMake);
        for(String car:carMake1){
            System.out.println("****************");
            System.out.println(car);
        }
    }

    //This method accepts Array as an argument of type String
    public static void printArray(String []cars){
        for(int i=0; i <= cars.length-1; i++){
            System.out.println( cars[i] );
        }
        System.out.println("********************");
       //enhanced for loop
        for(String car: cars){
            System.out.println(car);
        }
    }
    public static String[] returnArray() {
        String [] carArray = {"AB","CD","EF","GH","IJ"};
        return carArray;

    }
}