package examples.polymorphism;

public class OverRidingClassConnection {
        void connect ()
        {
        }
    }
    class myOracleConnection extends OverRidingClassConnection
    {
        void connect ()
        {
            System.out.println ("Connected to Oracle");
        }
    }
    class mySQLConnection extends OverRidingClassConnection
    {
        void connect ()
        {
            System.out.println ("Connected to MySQL");
        }
    }

