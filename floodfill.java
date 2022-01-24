 import java.io.*;
 import java.util.*;
 public class floodfill{
        public static void main(String [] args){
            Scanner sc = new Scanner(System.in);
            int n= sc.nextInt();
            int m= sc.nextInt();
            int [][] arr = new int[n][m];
            for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr[0].length ;j++){
                    arr[i][j]= sc.nextInt();
                }
            } 
            boolean [][] visited=  new boolean[n][m];
            cfloodfill(arr, 0, 0, "", visited); 

        } 
        public static void cfloodfill(int [][] maze, int row, int col, String psf, boolean [][] visited){
              if(row<0 || col<0 || row == maze.length || col== maze[0].length || maze[row][col]==1 || visited[row][col]==true){
                  return;
              } 
               
              if(row== maze.length && col== maze[0].length){
                  System.out.println(psf);
                  return;
              }
              
              visited[row][col]=true;
             cfloodfill(maze, row-1, col, psf+ "t", visited);
             cfloodfill(maze, row, col-1, psf+ "d", visited);
             cfloodfill(maze, row+1, col, psf+ "l", visited);
             cfloodfill(maze, row, col+1, psf+ "r", visited); 
             visited[row][col]=false;
        } 

}