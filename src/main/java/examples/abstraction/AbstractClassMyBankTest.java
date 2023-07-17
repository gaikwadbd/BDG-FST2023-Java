package examples.abstraction;

public class AbstractClassMyBankTest {
          public static void main (String[]args)
        {
            AbstractClassMyBank myBank;
            myBank = new MyBankSBI ();
            System.out.println ("SBI Rate of Interest is: " + myBank.getRateOfInterest () + " %");
            myBank = new MyBankICICI();
            System.out.println ("PNB Rate of Interest is: " + myBank.getRateOfInterest () +" %");
        }
    }
