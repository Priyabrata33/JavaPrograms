package JAVAaPI;

import java.awt.*;

public class FirstAPP extends Frame {
	
	Label l;
	Button b;
	TextField tf;
	
	public FirstAPP(){
		
		super("My First App");						//For naming i.e. i take the constructor of the 
		setLayout(new FlowLayout());
		l = new  Label("Name");
		tf = new TextField(20);					//Call all the componet Object for your App;
		b = new  Button("OK");
		
		
		add(l);
		add(tf);
		add(b);
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FirstAPP f = new  FirstAPP();
		
		f.setSize(400, 400);
		f.setVisible(true);
		
	}

}
