import java.io.*;
import java.util.*;
public class nil{
    public static void main(String [] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m  = sc.nextInt();
      int [][] arr = new int[n][m];
      for(int i =0 ;i<arr.length;i+=1){
          for(int j =0 ;j<arr[0].length;j+=1){
            arr[i][j] = sc.nextInt();
          }
      }

       getsol(arr);


     } 
    public static void getsol(int [][] arr){
 
       for(int i =0 ;i<arr.length;i+=1){
           for(int j =i ;j<arr[0].length;j+=1){
               System.out.print(arr[i][j] + " ");
           } 
           System.out.println();
       }

    }

  public static void print(int [][] arr){
      for(int i =0 ;i<arr.length;i+=1){
          for(int j =0 ;j<arr[0].length;j+=1){
              System.out.print(arr[i][j] + " ");
          } 
          System.out.println();
      }
  }
}