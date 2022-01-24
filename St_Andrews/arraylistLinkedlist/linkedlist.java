import java.util.*;
public class linkedlist {
	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<>();
		ll.add("Element 1");
		ll.add("Element 2");
		ll.add("Element 3");
		ll.add("Element 4");
		Iterator i1 = ll.iterator();
		while(i1.hasNext()){
			System.out.println(i1.next());
		}
		ll.remove();
		ll.remove();
		Iterator i2 = ll.iterator();
		while(i2.hasNext()){
			System.out.println(i2.next());
		}
	}
}
