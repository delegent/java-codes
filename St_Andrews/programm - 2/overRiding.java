class Animal{
	public void speak(){
		System.out.println("Animal Speaks");
	} 
}
class Dog extends Animal{
	public void speak(){
		System.out.println("Dog Barks");
	}
}
class Lion extends Animal{
	public void speak() {
		System.out.println("Lion Roars");
	}
}
public class overRiding{
	public static void main(String[] args) {
		Lion l = new Lion();
		Dog d = new Dog();
		l.speak();
		d.speak();
	}
}