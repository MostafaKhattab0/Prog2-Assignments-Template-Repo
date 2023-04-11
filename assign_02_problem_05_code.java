//Mostafa Mohamed 202006209
package problems;
import java.util.*;
public class Problems 
{
    public static int IsPrime(int num)
    {
    
    int count=0;
            for (int i=1; i<=num; i++)
               {

                       if (num<=1)
                           { 
                            return 0;
                           }
                       if (num%i==0)
                        count++;

               }
             if (count > 2)
                {
                      return 0;
                }       
               if (count == 2)
                 {
              return 1;
                 }
          //  System.out.println("the count is : " + count);
               return 5;

            
     }   
            
    public static void main(String[] args) 
    {
   
           
  Scanner sc = new Scanner(System.in);
    
   int result;  
   int loop = sc.nextInt();
            for (int i=1; i<=loop; i++)
            {
               int num = sc.nextInt();


               result = IsPrime(num);

                    if (result == 1)
                    {
                            System.out.println("Prime");
                    }
                   if (result == 0)
                    {
                            System.out.println("Not");
                    }
            }
    }
}