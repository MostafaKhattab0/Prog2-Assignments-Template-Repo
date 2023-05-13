//MostafaMohamed 202006209
package BankSystem;

public class Main
{
    public static void main(String[] args)
    {

    BankAccount bankaccount = new BankAccount();

    Employee employee = new Employee("Ali",18,'M', 2500,"Customer Service");

    Customer customer = new Customer("Mostafa", 20 ,'M', "eg123","st 321", bankaccount);



    employee.setSalary(3000);
    employee.setDepartment("IT");
    employee.PrintData();
    double returnSalary = employee.getSalary();
    String returnDepartment = employee.getDepartment();
    employee.Greet();

    customer.PrintData();
    customer.Greet();
    customer.setAddress("st123");
    customer.setSSN("egypt123");

    double returnBalance = bankaccount.getBalance();
    bankaccount.setBalance(1000);
    bankaccount.setBalance(1000,10);

    }
}


