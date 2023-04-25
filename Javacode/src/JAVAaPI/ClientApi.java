package JAVAaPI;

import java.awt.*;

public class ClientApi extends Frame{
	
	
	Label l;
	Button b;
	TextField tf;
	
	ClientApi(){
		super("Client Side");
		
		
		l = new Label("Enter the Actual Data: ");
		tf = new TextField(20);
		b = new Button();
		setLayout(new FlowLayout());
		add(l);
		add(tf);
		add(b);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClientApi c = new ClientApi();
		c.setSize(400,400);
		c.setVisible(true);
		
		

	}

}
