import java.io.*;
import java.util.*;
public class oops{

	// defining the class Person
	 protected  static class Person{
		 /*
			Feilds or instance variables or Attributes of the class are
			name - > for the name of the person
			age -> for the persons age
			hobbies -> to set the two hobbies of  person

		 */
		String name;
		int age;
		String [] hobbies = new String[2];  
		/*
			Member Functions
			setDetails() -> to set the values of the Person
			printDetails() -> to print the Details of the Person
		*/
		 void setDetails(String n, int a, String [] h){
			name = n;
			age = a;
			hobbies = h;			

		}

		 void printDetails(){
			System.out.println("Name = " + name);
			System.out.println("Age = " + age);
			System.out.println("Hobbies are : ");
			for(int i = 0 ; i < hobbies.length ; i++){
				System.out.println(hobbies[i]);;
			}

		}

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the name of Person : ");
		String name = sc.nextLine();
		System.out.println("Enter two hobbies of Person : ");
		String [] hobbies = new String[2];
		for(int i = 0 ; i < hobbies.length ;i++){
				hobbies[i] = sc.nextLine();
		}
		System.out.print("Enter the age of Person : ");
		int age = sc.nextInt();
		Person p1 = new Person();
		p1.setDetails(name, age, hobbies);
		p1.printDetails();
		
	}

}