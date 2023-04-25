package JAVAaPI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
public class TextEventDemo  extends Frame implements ActionListener, TextListener{

	
	Label l1,l2;
	TextField tf;
	
	TextEventDemo(){
		super("Text Field Demo");
		setLayout(new FlowLayout());
		
		l1 = new Label("No Text Entered. Text Field is Blank");
		
		l2 = new Label("Enter key is not hit");
		
		tf = new  TextField(20);
		tf.addTextListener(this);
		tf.addActionListener(this);
		
		
		add(l1);
		add(tf);
		add(l2);
	
	}
	
	String str = "";
	

	@Override
	public void textValueChanged(TextEvent e) {
		l1.setText(tf.getText());
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		l2.setText(tf.getText());
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TextEventDemo t = new TextEventDemo();
		t.setSize(400,400);
		t.setVisible(true);

	}

}
