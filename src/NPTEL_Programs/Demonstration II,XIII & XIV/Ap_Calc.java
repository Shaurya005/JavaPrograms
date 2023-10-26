//GUI where a user can enter name and id of student then it can be used
//Here we are creating GUI using an applet not by frame.
import java.awt.*;
import java.awt.event.*;
import java.awt.TextField.*;
import java.applet.*;
public class Ap_Calc extends Applet implements ActionListener {
	TextField one,two,res;//Three text fields are created.
	Button add,sub,mul,div;//Four buttons
	public void init() {
		Label l1 = new Label("First Number: ", Label.RIGHT);//Right Alignment
		Label l2 = new Label("Second Number: ", Label.RIGHT);
		Label l3 = new Label("Result Number: ", Label.RIGHT);

		one = new TextField(5);//5 is size of text field.
		two = new TextField(5);
		res = new TextField(7);

		add = new Button("Add");
		add = new Button("subtract");
		add = new Button("Multiply");
		add = new Button("Divide");

		add(l1);
		add(one);
		add(l2);
		add(two);
		add(l3);
		add(res);

		add(add);
		add(sub);
		add(mul);
		add(div);
//Here we are adding in above order because it will be added as per default layout manager
		one.addActionListener(this);
		two.addActionListener(this);
		res.addActionListener(this);
		add.addActionListener(this);
		sub.addActionListener(this);
		div.addActionListener(this);
		mul.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae){
		String str=ae.getActionCommand();
		float b1,b2,b3=0;
		String msg;

		b1=Float.parseFloat(one.getText());
		b2=Float.parseFloat(two.getText());


		if(str.equals("Add"))
			b3=b1+b2;
		if(str.equals("Subtract"))
			b3=b1-b2;
		if(str.equals("Divide"))
			b3=b1/b2;
		if(str.equals("Multiply"))
			b3=b1*b2;
		msg=String.valueOf(b3);
		res.setText(msg);
		repaint();
	} 
	public void paint(Graphics g){
	}
}
/*
<applet code="Ap_Calc.class" width=450 height=250>
</applet>
 */