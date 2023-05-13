//MostafaMohamed 202006209
package BankSystem;

final public class BankAccount
{
     private double balance;


    public double getBalance()
    {
        //balance = balance + (balance + 0.1)
        return balance * 1.1;
    }

    public void setBalance(double amount)
    {
        if (amount >= 0 && amount <= 1000000)
        {
            this.balance += amount;
        }
        else
        {
            System.out.println("Invalid balance value: " + amount);
        }
    }

    public void setBalance(double amount, double Tax_percent)
    {
        this.balance += amount - (amount * (Tax_percent/100));
    }

}
