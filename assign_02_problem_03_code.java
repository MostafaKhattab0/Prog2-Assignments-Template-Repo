//Mostafa Mohamed 202006209
package problems;
import java.util.*;
public class Problems 
{

    public static void main(String[] args) 
    {
   
        
    Scanner sc = new Scanner(System.in);
 int n = sc.nextInt();
      
 
      for ( int j=0; j<n; j++)
      {
         for (int i = 0; i <= n; i++)
         {
          System.out.print("*");
          if (i == j)
              break;
         }
          System.out.print("\n");
      }
      
    }
    
}