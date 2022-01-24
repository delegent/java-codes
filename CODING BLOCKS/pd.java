import java.io.*;
import java.util.*;
public class pd{
    
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        permutations("abc","");
    }
    public static void pd(int n){
       if(n == 0){
           return;
       }

        pd(n-1);
        System.out.println(n);
    } 


    public static void coinT(int n ,  String ans){
    if(n == 0){
        System.out.println(ans);
        return;
    
    }
        coinT(n-1, ans + "H");
        coinT(n-1, ans + "T");
    } 
///loe
int count = 0;
    public static void climb(int n, String ans){
       
        if(n<0){
            return;
        }else if(n == 0){
            System.out.println(ans);
            return;
        }

        climb(n-1,ans + "1");
        climb(n-2,ans + "2");
        climb(n-3,ans + "3");
    }


    public static void permutations(String str, String ans){
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }

         for(int i = 0 ; i < str.length() ;i += 1 ){
            
            String roq = str.substring(0,i) + str.substring(i+1);
             permutations(roq, ans + str.charAt(i));

         }


    }

}