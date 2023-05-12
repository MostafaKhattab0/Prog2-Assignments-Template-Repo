//Mostafa Mohamed 202006209
public class BankAccount
{
    static int NumOfCalls= 0;
    static int NumOfUsers = 0;
    String UserName;
    String BankName;
    double Balance;
    final String country = "Egypt";


    public BankAccount()
    {
        this.Balance = 0;
        this.UserName = null;
        this.BankName = null;
        System.out.println("A bank account has been created");
        NumOfUsers++;
    };

    public BankAccount(int x)
    {
        System.out.println("A bank account has been created");
        this.Balance = x;
        this.UserName = null;
        this.BankName = null;
        NumOfUsers++;
    };

    public double Deposit(double Money)
    {
        this.Balance+= Money;
        NumOfCalls++;
        return Balance;
    };


    public double Withdraw(double Money)
    {
        this.Balance-= Money;
        NumOfCalls++;
        return Balance;

    };



}
