package examples.inheritance;
class FatherBankAccount
{
    int bankBalance = 500000;
    int withdrawAmt=2000;
    public void withDrawAmountFromFatherAccount(){
        System.out.println ("Amount Withdrawn: " +withdrawAmt);
    }

}
class DaughterBankAccount extends FatherBankAccount
{
    int bankBalance = 300000;
    public void displayBalance ()
    {
        System.out.println ("Bank Balance: " + super.bankBalance);
    }
    public void getBalance(){
        System.out.println ("Bank Balance: " + bankBalance);
    }
    public void withDrawAmountFromDautherAccount(){
        System.out.println ("Amount Withdrawn: " +super.withdrawAmt);
    }
}

public class InheritanceSupertTest
{
    public static void main (String[]args)
    {
        DaughterBankAccount objdaughterbankac = new DaughterBankAccount ();
        objdaughterbankac.displayBalance ();
        objdaughterbankac.getBalance();
        objdaughterbankac.withDrawAmountFromDautherAccount();
        objdaughterbankac.withDrawAmountFromDautherAccount();
    }
}


