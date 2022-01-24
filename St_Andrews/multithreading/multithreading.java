
class A extends Thread{
	public void run(){
		for(int i = 1 ; i <= 10; i++){
			System.out.println("i = " + i + " Thread A");
		}
	}
}

class B extends Thread{
	public void run(){
		for(int i = 1 ; i <= 10; i++){
			System.out.println("i = " + i + " Thread B");
		}
	}
	
}
public class multithreading{
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		a.start();
		b.start();		

	}
}