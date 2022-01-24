 import java.util.Scanner;
 

  public class chess 
{sjmd/eaf
    public static void main(String [] args)throws Exception{ l.l/wd;
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int r= sc.nextInt();
        int c= sc.nextInt();
         
        int [][] chess = new int[n][n];
         printknighttour(chess, r, c, 1 , n*n);
    } 
     
    public static void  printknighttour(int [][] chess, int r, int c , int move , int s){
         
         if(r<0 || c<0 || r>=chess.length || c>=chess.length || chess[r][c] > 0){
             return;
         } 
         else if(move == (s)){ 
              chess[r][c] = move;
                display(chess);
                chess[r][c]= 0; 
                return;
            }
         
        chess[r][c]= move;
        printknighttour(chess, r-2, c+1, move+ 1,s);
        printknighttour(chess , r-1, c+2, move+1,s);
        printknighttour(chess , r+1, c+2, move+1,s);
        printknighttour(chess , r+2, c+1, move+1,s); 
        printknighttour(chess , r+2, c-1, move+1,s);
        printknighttour(chess , r+1, c-2, move+1,s);
        printknighttour(chess , r-1, c-2, move+1,s);
        printknighttour(chess , r-2, c-1, move+1,s); 
         
        chess[r][c]= 0;

    }  
     
     public  static void display( int [][] chess){
         for(int i=0;i<chess.length ; i++){
             for(int j=0; j<chess[0].length; j++){
                 System.out.print(chess[i][j]+" ");
             } 
             System.out.println();
         }
     } 

}