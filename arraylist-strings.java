import java.util.*;

public class Main{

public static void main(String[] args) {
   String str = "Anubhav";
   System.out.println(str);
   
   for(int i =0 ;i<str.length();i+=1){
       char ch = str.charAt(i);
       System.out.println(ch);
   } 
   String ss = str.substring(1,7); ///substrings
   System.out.println(ss);  
   String s1 = str.substring(2);
   System.out.println(s1); 
   
   
   
   /// Arraylist
   ArrayList<Integer> list = new ArrayList<>();  // declaring an arraylist of itegers
   System.out.println(list + " " + list.size());
   list.add(10); // add the element a ge particular index.
   list.add(34);
   list.add(678);
   System.out.println(list +" "+ list.size()); 
   
   
   for(int val : list){   //for-ah loop for alculatig the value.
       System.out.println(val);
   } 
   for(int i = 0 ;i<list.size();i+=1){ /// list.size() tells the sixe of the arra lsit
       System.out.println(list.get(i));
   } 
   
   list.set(2,300);  /// sets but didnt increase the sixe of the array list
   System.out.println(list); 
   list.add(2,1000);/////sets but also increase sthe size of thae array list
   System.out.println(list); 
   list.remove(1);
   System.out.println(list);
}
}