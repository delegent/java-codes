
interface printable{  
	void print();  
}  
class interfacee implements printable{  
	public void print(){System.out.println("Hello");}  
	  
	public static void main(String args[]){  
	interfacee obj = new interfacee();  
	obj.print();  
	 }  
	
}  