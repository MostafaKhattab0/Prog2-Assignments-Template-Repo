//Mostafa Mohamed 202006209
package problems;
import java.util.*;
public class Problems 
{
           public static int calc(int x,  int y ) 
                {
                        int sum = 0,count = 0;
                        int container;
                        if (x > y)
                            {
                               container = x;
                               x = y;
                               y = container;
                            }
                          for(int j = x + 1; j < y ; j++)
                        {
                            
                               if (j%2!=0)
                               {
                                   sum+=j;
                               }
                               
                        }
                        return  sum;
                }
    public static void main(String[] args) 
    {
            Scanner sc = new Scanner(System.in);

           int cases= sc.nextInt();
           int sum;
           int x , y;
             for (int i = 0; i < cases ; i++)
             {
                      x = sc.nextInt();
                      y = sc.nextInt();

                       sum = calc(x , y);

             System.out.println(sum);
             }


    }
}