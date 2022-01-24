class Person{
	protected String gender = "male";
	public void intro(){
		System.out.println("Hello I am a boy");
	} 
}

class Boy extends Person{
	String name = "Anubhav";
} 
public class inheritance {
	public static void main(String[] args) {
		Boy b = new Boy();
		b.intro();
		System.out.println("My name is " + b.name + " and my gender is " + b.gender);
	}
}
