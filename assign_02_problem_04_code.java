//Mostafa Mohamed 202006209
package problems;
import java.util.*;
	            //Note at line 21 & 22: I knew after it got accepted that i could wrote it easier without this "if cond." but i prefered to submit it like that.. to show you my way of thinking at first
public class Problems 
{

    public static void main(String[] args) 
    {
   
        
    Scanner sc = new Scanner(System.in);
 int n = sc.nextInt();
      
 
      for ( int j=0; j<n; j++)
      {
         for (int i = n-1; i >= 0; i--)
         {
          System.out.print("*");
          if (i == j)
              break;
         }
          System.out.print("\n");
      }
      
    }
    
}