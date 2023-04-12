//Mostafa Mohamed 202006209
package problems;
import java.util.*;
public class Problems 
{
            
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       
        int loop= sc.nextInt();
        int num = 0;
        int container = 0;
            for(int i = 0; i < loop; i++)
            {
                 for(int j = 1; j <= 100; j++)
                {
                        if (container == loop)
                            {
                                break;
                            }
                        if (j%4==0)
                                {
                                    System.out.println("PUM");
                                    container++;
                                
                                }
                        if (j%4!=0)
                                {
                                    System.out.print(j + " ");
                                }
                     
                }
              
               
               
           }
            
    }
}