//MostafaMohamed 202006209
package BankSystem;

public class Customer extends Human
{
    private String SSN;
    private String address;
    BankAccount bankAccount;
    Customer(String name, int age, char gender , String SSN, String address, BankAccount bankAccount)
    {
        super(name, age, gender);
    this.SSN = SSN;
    this.address = address;
    this.bankAccount = bankAccount;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public void setAddress(String address) {
        this.address = address;
    }




}

