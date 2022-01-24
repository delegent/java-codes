import javax.swing.*; 
import java.awt.event.*;///Action listener and action event
public class GUI implements ActionListener{ 
 
     JButton button;
   public static void main(String [] args){
        GUI gui = new GUI();
		gui.go();
		
   }
		
		public void go(){
		JFrame frame = new JFrame();
	   JButton button = new JButton("click me");
        button.addActionListener(this);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(button);
		frame.setSize(100,100);
		frame.setVisible(true);
   
   } 
    
	public void actionPerformed(ActionEvent event){
		button.setText("I am clicked");
	}

}