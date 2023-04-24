//Mostafa Mohamed 202006209
package problems;
import java.util.*;
public class Problems 
{
    
    
    public static int search(int loop) 
                {
             Scanner sc = new Scanner(System.in);
                  int[] A= new int [loop];
                   for (int i = 0 ; i < loop; i++)
                    {

                        A[i]= sc.nextInt();
                    }
                   
                   ///////////
                 int n = sc.nextInt();
                  for (int j = 0; j < loop; j++)
                  {
                    if (n == A[j])
                    {
                        return j;
                    }
                  }
                   ///////////
                   
                   
                   return -1;
                }
    
    
    public static void main(String[] args) 
    {
            Scanner sc = new Scanner(System.in);
           int loop = sc.nextInt();

           int  result = search(loop);
           
                    System.out.println(result);   
    }
                   
}