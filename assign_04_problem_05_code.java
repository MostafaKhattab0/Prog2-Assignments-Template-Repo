//Mostafa Mohamed 202006209
package problems;
import java.util.*;
public class Problems 
{

    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
       
        for (int t = 0; t < test; t++)
        {
             int loop = sc.nextInt();
             int[] A = new int [loop];
                for (int k = 0; k < loop; k ++)
                {

                    A[k] = sc.nextInt();

                }

                int result ;
                int min = 9999999;

                for (int i = 1; i <= loop - 1 ; i++)

                {

                    for (int j = 1+i ; j <= loop; j++ )

                    {
                        result = A[i-1] + A[j-1] + j - i; 

                        if (result < min )
                        {
                            min = result;
                        }
                    }


                }
                 System.out.println(min);
        }
 

    }
                   
}