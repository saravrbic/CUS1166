import javax.swing.*;
import java.awt.event.*;  
public class GUI{
public static void main(String args[]) {
	
	
JFrame frame = new JFrame("Vehciular Cloud");

frame.setSize(500,400);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//JTextField field1 = new JTextField(40);

JLabel W = new JLabel("<html><span style='font-size:20px'>"+" Welcome to VCRTS!"+"</span></html>");

W.setBounds(150, 20, 500, 100);


JLabel Q = new JLabel("<html><span style='font-size:10px'>"+" Are you a client registering a job or"+"\n"+" an owner renting your vehicle?"+"</span></html>");
Q.setBounds(50, 90, 500, 100);


//frame.add(field1);
frame.add(W);
frame.add(Q);
frame.setLayout(null);
frame.setVisible(true);




}

}
