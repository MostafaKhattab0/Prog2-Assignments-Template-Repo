//Mostafa Mohamed 202006209
package problems;
import java.util.*;
public class Problems 
{
            
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        int space = num-1;
        int star = 1;
            for(int i = 0; i < num; i++)
            {
                /////////////////////////
                for (int j = space; j > 0 ; j--)
                        {
                       System.out.print(" ");
                       
                        }
                space--;
                /////////////////////////
                for (int k = 1; k <= star ; k++)
                    {
                         System.out.print("*");
                      
                    }
               star+=2;
                ////////////////////////
                System.out.println();
            }
            
    }
}