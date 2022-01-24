import java.util.*;
public class queue {
	public static void main(String[] args) {
		Queue<String> q = new ArrayDeque<>();
		q.add("Anubhav");
		q.add("Raj");
		q.add("Srivastava");
		q.add("Male");
		q.add("Female");
		Iterator i1 = q.iterator();
		while(i1.hasNext()){
			System.out.println(i1.next());
		}
		q.remove();
		Iterator i2 = q.iterator();
		while(i2.hasNext()){
			System.out.println(i2.next());
		}
	}
}
