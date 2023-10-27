//package NPTEL_Programs.Demonstration_2_13_14;
//
//import java.applet.Applet;
//import java.awt.Graphics;
//import java.awt.Color;
//
//public class secondApplet extends Applet{
//
//	public void init(){
//	//To resize an applet window use void resize(int x,int y) method of an applet class.
//	//resize method is there in Applet class
//	resize(500,500);
//
//	//Here we change the default grey color background of an applet to yellow background.
//	setBackground(Color.RED);//All the colors are defined in color class
//	//So init() method is basically used to intialize your applet view
//	}
//	public void paint(Graphics g){
//	g.drawString("Hello World",250,150);//Use this syntax to display on screen
//	g.drawString("Applet Background example",0,50);
//	//Here 150,150 is x and y co-ordinates in the Applet window where text will be printed
//	//On running applet it will have title Applet Viewer: secondApplet.class
//	}
//}