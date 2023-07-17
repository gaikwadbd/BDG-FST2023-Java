package examples;

class MethodOverloading {
    static int add(int a, int b) {
        return a + b;
    }
    static int add(int a, int b, int c) {
        return a + b + c;
    }
    static int addition(int a, int b) {
        return a + b;
    }
    static double addition(double a, double b) {
        return a + b;
    }
 }
 public class MethodOverloadingTest extends MethodOverloading{

     public static void main(String[] args) {
         System.out.println(MethodOverloading.add(11, 11));
         System.out.println(MethodOverloading.add(11, 11, 11));
         System.out.println(MethodOverloading.addition(20, 30));
         System.out.println(MethodOverloading.addition(34.33,45.90));
     }
 }
