package Main; 
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class puzzle extends Frame implements ActionListener{

    Button b1 ,b2,b3,b4,b5,b6,b7,b8,b9;
    puzzle(){
        super("Puzzle - Java");
        b1 = new Button("1");
        b1.setBounds(50,100,40,40);
        b2 = new Button("2");
        b2.setBounds(50,100,40,40);
        b3 = new Button("3");
        b3.setBounds(50,100,40,40);
        b4 = new Button("4");
        b4.setBounds(50,100,40,40);
        b5 = new Button("5");
        b5.setBounds(50,100,40,40);
        b6 = new Button("6");
        b6.setBounds(50,100,40,40);
        b7 = new Button("7");
        b7.setBounds(50,100,40,40);
        b8 = new Button("8");
        b8.setBounds(50,100,40,40);
        b9= new Button("9");
        b9.setBounds(50,100,40,40);
    
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    b4.addActionListener(this);
    b5.addActionListener(this);
    b6.addActionListener(this);
    b7.addActionListener(this);
    b8.addActionListener(this);
    b9.addActionListener(this);
     

    add(b1);add(b2);add(b3);add(b4);add(b5);add(b6);add(b7);add(b8);add(b9);
    setSize(600,600);
    setLayout(null);
    setVisible(true);
} 
public void actionPerformed(ActionEvent arg0){

}
public static void main(String [] args){
    new puzzle();
}




}