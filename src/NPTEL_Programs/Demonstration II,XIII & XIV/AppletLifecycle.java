//In order to remove the applet completely from the memory, we have to use destroy() method.
//Demonstration of the usage of destroy() in an applet program.

import java.applet.Applet;
import java.awt.Graphics;

public class AppletLifecycle extends Applet{
StringBuffer strBuffer;
public void init(){
strBuffer=new StringBuffer();
addItem("Initializing the applet");
}
public void start(){
addItem("starting the applet");
}
public void stop(){
addItem("stopping the applet");
}
public void destroy(){
addItem("unloading the applet");
}
//Destroy method can be called only when the stop() method is invoked.
void addItem(String word){
System.out.println(word);//print on the console as well as print on applet screen using repaint() method
strBuffer.append(word);
repaint();
}
public void paint(Graphics g){
//Draw a Rectngle around the applet's display area
g.drawRect(0,0,getWidth()-1,getHeight()-1);
//Display the string inside the rectangle.
g.drawString(strBuffer.toString(),10,20);}
}
//<applet code="AppletLifecycle.class" width="300" height="200"></applet>