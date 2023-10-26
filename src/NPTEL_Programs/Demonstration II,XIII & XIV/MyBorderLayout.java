import java.awt.*;
//Here entire region is divided into five regions viz. north.south.east.west and center.
public class MyBorderLayout {
	Frame f;
	MyBorderLayout(){
		f=new Frame();
		Button b1=new Button("NORTH");
		Button b2=new Button("SOUTH");
		Button b3=new Button("EAST");
		Button b4=new Button("WEST");
		Button b5=new Button("CENTER");
		f.add(b1,BorderLayout.NORTH);
		f.add(b1,BorderLayout.SOUTH);
		f.add(b1,BorderLayout.EAST);
		f.add(b1,BorderLayout.WEST);
		f.add(b1,BorderLayout.CENTER);
		f.setSize(300,300);
		f.setVisible(true);
	}
	public static void main(String args[]){
		new MyBorderLayout();
	}
}