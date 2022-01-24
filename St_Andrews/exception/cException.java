import java.io.IOException;

// class customException extends Exception{ // custom exception class
// 	public String getMessage(){
// 		return "This is the custom error message";
// 	}
// }

// public class cException {
// 	public static void main(String[] args) {
// 		int a = 10;
// 		// int b = 7;
// 		try {
// 			System.out.println("Built in exception ");
// 			if(b == 7){
// 				throw new customException();
// 			}
// 		}
// 		catch(customException ce){
// 			System.out.println(ce.getMessage());
// 		}
// 		// catch (Exception e) {
// 		// 	System.out.println(e.getMessage());
// 		// }
// 		finally{
// 			System.out.println("Exception resolved -- (finally block)");
// 		}
// 	}	
// }


public class cException
{  
    // defining a user-defined method  
    // which throws IOException  
    static void method() throws IOException  
    {  
        System.out.println("Inside the method()");  
        throw new IOException("throwing IOException");  
    }  
    //main method  
    public static void main(String args[])  
    {  
        try  
        {  
            method();  
        }  
        catch(IOException e)  
        {  
			System.out.println(e.getMessage());
            System.out.println("caught in main() method");  
        }  
		finally{
			System.out.println("Inside Finally");
		}
    }  
}  