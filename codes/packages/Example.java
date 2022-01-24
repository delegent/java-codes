package pack1;
import pack2.Student;
public class Example {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setRollNo(100);
		s1.setName("Anubhav");
		System.out.println("Roll No. is " + s1.getRollNo());
		System.out.println("Name is " + s1.getName());
	}
}
