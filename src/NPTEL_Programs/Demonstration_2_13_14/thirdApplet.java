//package NPTEL_Programs.Demonstration_2_13_14;//We can't give or applet cannot take direct input from the keyboard.
////Even Applet cannot take any input from any other sources like say key file or any network and applet also cannot write anything into anwhere also, applet only can display on the screen.
////So how an applet can be given input to that, so it is possible by the means of HTML only
//import java.applet.Applet;
//import java.awt.Graphics;
//public class thirdApplet extends Applet{
//  public void paint(Graphics g){
//  int x1=0;int y1=0;
//  String msg1="";
//  x1=Integer.parseInt(getParameter("xParamet"));//Java reads everything in form of String so this line is parsing or pre-processing of value to integer so it basically converts string to an integer value.
//  //These values will be collected from HTML
//  //getParameter is a method which will read from the HTML
//  y1=Integer.parseInt(getParameter("yParamet"));
//  int x2=Integer.parseInt(getParameter("x2Paramet"));
//  int y2=Integer.parseInt(getParameter("y2Paramet"));
//  msg1 = getParameter("msg");//It will also read a parameter msg that is there in HTML and return as a string so need not to parse into any other type
//  String msg2 = getParameter("msg2");
//  //This applet will take a message from the outside also and message will be stored in temp. var. msg
//  g.drawString(msg1,x1,y1);
//  g.drawString(msg2,x2,y2);
//  }
//  }
//  //Compile in cmd by javac thirdApplet.java
//  //And then run applet by appletviewer new2.html