package examples.abstraction;
abstract class AbstractClassMyBank {
        abstract int getRateOfInterest ();
    }
    class MyBankSBI extends AbstractClassMyBank
    {
        int getRateOfInterest ()
        {
            return 7;
        }
    }
    class MyBankICICI extends AbstractClassMyBank
    {
        int getRateOfInterest ()
        {
            return 8;
        }
    }

