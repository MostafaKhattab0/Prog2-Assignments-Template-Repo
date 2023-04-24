//Mostafa Mohamed 202006209
package problems;
import java.util.*;
public class Problems 
{
   
    public static void main(String[] args) 
    {
            Scanner sc = new Scanner(System.in);
            int loop = sc.nextInt();
         int[] A= new int [loop];
          
                   for (int i = 0 ; i < loop; i++)
                       {

                            A[i]= sc.nextInt();
                              if (A[i]<=10)
                              {
                              System.out.println("A"+ "[" + i +"]" + " = " + A[i]);
                              }
                               if (i==loop)
                                    break;
                       }
                  


    }
}