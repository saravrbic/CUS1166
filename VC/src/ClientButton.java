import javax.swing.JFrame;
import javax.swing.JLabel;

public class ClientButton {

	
		
		JFrame frame= new JFrame();
		JLabel a= new JLabel("Hello!");
		ClientButton(){
		a.setBounds(0,0,100,50);
		
			JFrame frame = new JFrame("Vehciular Cloud: Client Window");


			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
			frame.setSize(500,400);
			frame.add(a);
			
			
		}
		
		
		
		

	}


