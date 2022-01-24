import java.io.*;
import java.util.*;
public class patterns
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        for(int i = 1 ; i<=5; i++)
        {
            for(int j = 1 ; j <= 5 ; j+=1)
            {
                if(j >= i){
                    System.out.print("*\t" );
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}