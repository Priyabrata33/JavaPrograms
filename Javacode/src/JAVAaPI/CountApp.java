package JAVAaPI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame extends Frame implements ActionListener {
	
	int count= 0;
	//Label l;
	Button b;
	Button reset;
	TextField tf;
	
	MyFrame(){
		super("Count App");
//		l = new Label("    "+count);
		tf   = new TextField(5);
		
		
		
		b = new Button("Count");
		b.addActionListener(this);			//add the listner to the given button 
		
		
		reset = new Button("Reset");
		reset.addActionListener(this);		//add the reset in the given button
		
		setLayout(new FlowLayout());
	
		add(b);
		//add(l);
		add(tf);
		add(reset);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()==b) {
		++count;
		tf.setText(String.valueOf(count));
		}
		else if(e.getSource()==reset) {
			count =0;
			tf.setText(String.valueOf(count));
		}
		
	}
	
	
	
}
public class CountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyFrame mf = new MyFrame();
		
		mf.setSize(400,100);
		mf.setVisible(true);
		

	}

}
