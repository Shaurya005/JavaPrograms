//package NPTEL_Programs.Demonstration_2_13_14;//The following program demonstrate the effect of stop() in an applet program.
////Create a child frame window from within an applet. Frame is basically a concept of awt.
//import java.awt.*;
//import java.applet.*;
//import java.awt.event.*;
//
///*<applet code="AppletFrame" width=300 height=50></applet>*/
//
////Create subclass of Frame.
//class SampleFrame extends Frame{
//SampleFrame(String title){
//super(title);
////Create an object to handle window events
//MyWindowAdapter adapter=new MyWindowAdapter(this);
////Register it to recieve those events
//addWindowListener(adapter);
//}
//public void paint(Graphics gr){
//gr.drawString("This is a frame window",10,40);
//}
//}
//class MyWindowAdapter extends WindowAdapter{
//	SampleFrame sampleFrame;
//	public MyWindowAdapter(SampleFrame sampleFrame){
//		this.sampleFrame=sampleFrame;
//	}
//	public void windowClosing(WindowEvent we){
//		sampleFrame.setVisible(false);
//	}
//}
////Create frame window
//public class AppletFrame extends Applet{
//	Frame f;
//	public void init(){
//		f=new SampleFrame("A Frame Window");
//		f.setSize(250,250);
//		f.setVisible(true);
//	}
//	public void start(){f.setVisible(true);}
//	public void stop(){f.setVisible(false);}
//	public void paint(Graphics g){g.drawString("This is in applet window",10,20);}
//}
////init(),start() and paint() are implicitely invoked in program while stop() needs to be explicitely invoked.
////On running this program two window are shown one is applet window and other is Frame window invoked in init() method of Applet.
////On closing Frame window, applet still running while onclosing applet window stop method is invoked and applet stops.