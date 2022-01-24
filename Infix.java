 import java.util.*;
 public class Infix{
    public static void main(String [] args){
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine(); 
      Stack<Integer> oprnds = new Stack<>();
      Stack<Character> oprtr = new Stack<>();
      for(int i=0;i<str.length();i++){
        char ch = str.charAt(i); 
        if(ch=='('){
           oprtr.push(ch);
        }  
        
        else if(Character.isDigit(ch)){
            oprnds.push(ch-'0');
        } 
        else if(ch == ')'){
             while(oprtr.peek()!='('){
                 char op= oprtr.pop();
                 int val2 = oprnds.pop();
                 int val1 = oprnds.pop();

                  int ans= operation(val1, val2, op); 
                  oprnds.push(ans);
             } 
             oprtr.pop();
        }else if(ch=='+' || ch=='-' || ch=='*' || ch=='/'){
            while(oprtr.size()>0 && oprtr.peek()!='(' && precedence(ch)<=precedence(oprtr.peek())){
                char op= oprtr.pop();
                int val2 = oprnds.pop();
                int val1 = oprnds.pop();

                 int ans= operation(val1, val2, op); 
                 oprnds.push(ans);
            }   
            oprtr.push(ch);  
        }
      } 
      while(oprtr.size()>0){
        char op= oprtr.pop();
        int val2 = oprnds.pop();
        int val1 = oprnds.pop();

         int ans= operation(val1, val2, op); 
         oprnds.push(ans);   

    } 
     System.out.println(oprnds.peek()); 
}

     
     public static int  precedence(char ch){
        if(ch=='+'|| ch=='-'){
            return 1;
        }
        else {
            return 2;
        }
    } 
     
    public static int  operation(int v1, int v2, char oprtr){
          if(oprtr=='+'){
             return v1+v2;
          }else if(oprtr=='-'){
            return v1-v2;
          }else if(oprtr=='/'){
            return v1/v2;
          }else {
            return v1*v2;
          }
    } 

}