import java.util.*;
public class arraylist {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("Anubhav");
		al.add("Srivastava");
		al.add("Raj");

		Iterator i1 = al.iterator();
		while(i1.hasNext()){
			System.out.println(i1.next());
		}
		al.remove("Srivastava");
		
		Iterator i2 = al.iterator();
		while(i2.hasNext()){
			System.out.println(i2.next());
		}

	}
}
