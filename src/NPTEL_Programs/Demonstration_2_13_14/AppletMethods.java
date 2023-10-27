//package NPTEL_Programs.Demonstration_2_13_14;/*Applet is an abstract class defined in java.applet package as it contains abstract methods - init,start,paint.
//init and start has no formal parameter but paint is always accompanied by one parameter of type Graphics.
//All these methods are not necessarily to be defined by the programmer. They are optional and preferably to be overriden as per need.
//
//The following shows default version of the methods :-
//
//public void init(){}
//public void start(){}
//public void stop(){}
//public void destroy(){}
//public void paint(Graphics g){}
//
//This is also one applet program:-
//
//import java.awt.*;
//import java.applet.*;
//public class A extends Applet{
//
//}
//*/
//import java.awt.*;
//import java.applet.*;
//public class AppletMethods extends Applet{
//String msg;
////Set the foreground and background colors.
//public void init(){
//setBackground(Color.cyan);//They are defined in java.awt package
//setForeground(Color.red);//Font color
//msg="Inside init()--";
//}
////Initialize the string to be displayed
//public void start(){
//msg+="Inside init()--";
//}
////Display message in applet window
//public void paint(Graphics g){
////Graphics is a class defined in package java.awt and g is an object of Graphics class.
//msg+="Inside init()--";
//g.drawString(msg,10,30);
//}
//}