import java.util.*;
public class stack {
	public static void main(String[] args) {
		Stack<String> st = new Stack<>();
		st.add("Anubhav");
		st.add("Raj");
		st.add("Srivastava");
		st.add("Male");
		Iterator i1 = st.iterator();
		while(i1.hasNext()){
			System.out.println(i1.next());
		}
        st.pop();
		Iterator i2 = st.iterator();
		while(i2.hasNext()){
			System.out.println(i2.next());
		}

	}
}
