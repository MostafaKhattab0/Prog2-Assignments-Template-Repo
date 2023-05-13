//MostafaMohamed 202006209
package BankSystem;

class Human
{
       protected String name;
       protected int age;
       protected char gender;

    Human(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    void PrintData()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }
   final void Greet()
   {
      System.out.println("Good Morning");
   }

}

