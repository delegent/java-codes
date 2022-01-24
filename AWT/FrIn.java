/**
 * FrIn
 */
import java.awt.Color;
import java.awt.Frame;
class FrIn extends Frame {

	public static void main(String[] args) {
		FrIn f = new FrIn();
		f.setTitle("Ahei");
		f.setSize(400,400);
		f.setVisible(true);
		f.setLocation(100,100);
		f.setBackground(Color.BLUE);
		boolean ans =  f.isVisible();
		System.out.println(ans);
		System.out.println("Updates");
	}

	// public FrIn(String name){
	// 	super(name);
	// }
}