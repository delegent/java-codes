class Multiply{
	public void multiply(int a,int b){
		System.out.println(a*b);
	}

	public void multiply(int a, int b, int c){
		System.out.println(a*b*c);
	}
}

/**
 * overLoading
 */
public class overLoading {

	public static void main(String[] args) {
		Multiply m = new Multiply();
		m.multiply(2, 3);
		m.multiply(2, 4, 6);
	}
}


