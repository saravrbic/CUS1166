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




JButton b = new JButton("Client");
b.setBounds(200,250,85,20);
JButton c = new JButton("Owner");

c.setBounds(200,200,85,20);

b.addActionListener(new ActionListener(){  
	public void actionPerformed(ActionEvent e){  
	
		  if(e.getSource()==b) {
			  ClientButton window= new ClientButton();
		  }
    }  
});  



c.addActionListener(new ActionListener(){  
	public void actionPerformed(ActionEvent e){  
		  if(e.getSource()==c) {
			  OwnerButton window= new OwnerButton();
		  }  
    }  
	});  

frame.add(c);
//frame.add(field1);
frame.add(W);
frame.add(b);
frame.add(Q);
frame.setLayout(null);
frame.setVisible(true);




}

}