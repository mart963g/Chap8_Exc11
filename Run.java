package Exc_11;

public class Run
{
    public static void main(String[] args)
    {
        BankAccount ac1 = new BankAccount("Konto 1",100.00);
        ac1.setTransactionFee(10.00);
        ac1.withdraw(90);
        ac1.withdraw(10);
    }
}
