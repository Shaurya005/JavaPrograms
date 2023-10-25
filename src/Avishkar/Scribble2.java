package Avishkar;

import java.applet.*;
import java.awt.*;
import java.awt.Color;

//Scribble applet using lower version of jdk toolkit
//Design of scribble applet, it allows user to draw something on applet or on container itself
//Other than just scribbling option there is option of cleaning and choice of colors
public class Scribble2 extends Applet{
	private int last_x,last_y;//Stores the last mouse location
	private Color current_color=Color.black;//Sore the current color
	private Button clear_button;//clear button
	private Choice color_choice;//Color dropdown list
	//This method is called to initiate applet and applet doesn't have main method.
	public void init(){
		//Set the Background color
		this.setBackground(Color.white);
		//Create a button and add to applet and set button color.
		clear_button=new Button("clear");
		clear_button.setForeground(Color.black);
		clear_button.setBackground(Color.lightGray);
		this.add(clear_button);

		//Create a menu of colors and add it to the applet/
		//lso set the menu's color and add a label
		color_choice=new Choice();
		color_choice.addItem("black");
		color_choice.addItem("red");
		color_choice.addItem("yellow");
		color_choice.addItem("green");
		color_choice.setForeground(Color.black);
		color_choice.setBackground(Color.lightGray);
		this.add(new Label("Color: "));
		this.add(color_choice);
	}
	//This method is called when the user clicks the mouse to start a scribble.
	public boolean mouseDown(Event e,int x,int y){
		last_x=x;last_y=y;
		return true;
	}
	//This method is called when user drags the mouse.
	public boolean mouseDrag(Event e,int x,int y){
		Graphics g=this.getGraphics();
		g.setColor(current_color);
		g.drawLine(last_x,last_y,x,y);
		last_x=x;last_y=y;
		return true;
	}
	//This method is called when the user clicks the button or choose a color
	public boolean action(Event e,Object arg){
		//If the Clear button was clicked on,handle it.
		if (e.target==clear_button){
			Graphics g=this.getGraphics();
			Rectangle r= this.bounds();
			g.setColor(this.getBackground());
			g.fillRect(r.x,r.y,r.width,r.height);
			return true;
		}
		//Otherwise if color is chosen, handle that
		else if(e.target==color_choice){
			if(arg.equals("black"))current_color=Color.black;
			else if(arg.equals("red"))current_color=Color.red;
			else if(arg.equals("yellow"))current_color=Color.yellow;
			else if(arg.equals("green"))current_color=Color.green;
			return true;
		}
		//Otherwise let the super class handle it.
		else return super.action(e,arg);
	}
}
/*
<applet code="Scribble2.class" height=500 width=400></applet>
 */