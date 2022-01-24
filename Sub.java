import java.io.*;
import java.util.*;
public class Sub{ 

   public static int sub_array(int [] arr, int d,int m){
           int rcount = 0;
    for(int i = 0; i<arr.length ;i+=1 ){ 
       int c = m; 
       int count = 0;
       int sum = 0;
       while(c!=0){  
           if((i+count) == arr.length){
               break;
           }
        sum += arr[i+count];
        c --;
        count+=1;
       }
             if (sum == d){
                rcount+=1;
             }
       } 
       return rcount;
   }

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int [] arr = new int[n];
      for(int i = 0 ;i <arr.length ; i+=1){
                arr[i] = sc.nextInt();
      }   
        int d = sc.nextInt();
        int m = sc.nextInt();
       int ans =  sub_array(arr, d, m); 
       System.out.println(ans);
    }
     
    } 
