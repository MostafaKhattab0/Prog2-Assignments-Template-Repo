//Mostafa Mohamed 202006209
package problems;
import java.util.*;
public class Problems 
{
           public static int Even(int num ) 
                {
                 
                       if (num > 0)
                       {
                            return  1;
                       }
                       if (num < 0)
                       {
                            return  2;
                       }
                        return 0;
                }
    public static void main(String[] args) 
    {
            Scanner sc = new Scanner(System.in);

           int cases= sc.nextInt();
           int result;
           int num ;
             for (int i = 0; i < cases ; i++)
             {
                        num = sc.nextInt();

                         result = Even(num);

                         
               System.out.print(result + " ");
             }


    }
}