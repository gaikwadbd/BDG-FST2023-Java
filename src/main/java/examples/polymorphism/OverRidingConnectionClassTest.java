package examples.polymorphism;

public class OverRidingConnectionClassTest {
         public static void main (String args[])
        {
            myOracleConnection oracleConnection = new myOracleConnection ();
            mySQLConnection sqlConnection = new mySQLConnection ();
            oracleConnection.connect ();
            sqlConnection.connect ();
        }
    }

