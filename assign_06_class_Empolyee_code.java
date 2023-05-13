//MostafaMohamed 202006209
package BankSystem;

public class Employee extends Human
{
    private double salary;
    private String department;
    public Employee(String name, int age, char gender, double salary, String department)
    {
        super(name, age, gender);
        this.salary = salary;
        this.department = department;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    public void setDepartment(String department)
    {
        this.department = department;
    }

    @Override
    void PrintData()
    {
        super.PrintData();
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
    }

    public double getSalary()
    {
        System.out.println("Salary: " + salary);
        return salary;
    }

    public String getDepartment()
    {
        System.out.println("Department: " + department);
        return department;
    }

}
