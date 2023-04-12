//Mostafa Mohamed 202006209
package problems;
import java.util.*;
public class Problems 
{
            
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
        int loop= sc.nextInt();
       int num0=0, num1=1, num2=0;
          System.out.print(num0 + " ");
            for(int i = 0; i < loop-1; i++)
            {
         
            num2 = num0 + num1;
            num0 = num1; 
            num1 = num2;
            System.out.print(num0 + " ");
            }
            
    }
}