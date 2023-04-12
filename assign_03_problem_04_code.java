//Mostafa Mohamed 202006209
package problems;
import java.util.*;
public class Problems 
{
           public static int calc(int x,  int y ) 
                {
                        int sum = 0,count = 0;
                          for(int j = x; j < 100 ; j++)
                        {

                            if (count == y)
                                {
                                    break;
                                }
                            if (j%2!=0)
                                {
                                    sum+= j;
                                    count ++;
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