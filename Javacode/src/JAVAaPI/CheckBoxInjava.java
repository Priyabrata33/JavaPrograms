package JAVAaPI;
import java.awt.*;
import java.awt.event.*;

class MyFrameForCheckBox extends Frame implements ItemListener{
	Label l;
	Checkbox cb1,cb2,cb3,cb4;
	CheckboxGroup cbg;			//for radio button of the check box 
	
	MyFrameForCheckBox(){
		super("Check Box Demo");
		
		cbg = new CheckboxGroup();
		
		setLayout(new FlowLayout());
		l = new Label("Choose Something: ");
		
		cb1 = new Checkbox("Java",false,cbg); //call the constructor for the radio button of the given item and find the value
		cb1.addItemListener(this);
		
		cb2 = new Checkbox("Python",false,cbg);//call the constructor directly for radio button
		cb2.addItemListener(this);
		
		cb3 = new Checkbox("C#",false,cbg);
		cb3.addItemListener(this);
		
		
		add(l);
		add(cb1);
		add(cb2);
		add(cb3);
		
	}
	
	
	
	
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		String str = "";
		
		if(cb1.getState())
			str = str+" "+cb1.getLabel();
		if(cb2.getState())
			str = str+" "+cb2.getLabel();
		if(cb3.getState())
			str = str+" "+cb3.getLabel();
		
		if(str.isEmpty()) {
			str = "Choose Something: ";
		}
		
		l.setText(str);
		
	}
	
	
}
public class CheckBoxInjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyFrameForCheckBox mc = new MyFrameForCheckBox();
		mc.setSize(400,400);
		mc.setVisible(true);

	}

}
