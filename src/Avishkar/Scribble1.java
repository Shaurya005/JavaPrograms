package Avishkar;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
//Design of scribble applet, it allows user to draw something on applet or on container itself
public class Scribble1 extends Applet implements MouseListener, MouseMotionListener {
	private int last_x,last_y;
	public void init(){
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
	}//In applet init method ome into picture, while it's not there in awt programming.
	@Override
	public void mouseDragged(MouseEvent e){//If we press and then move the mouse then it is mouseDragging Event.
		Graphics g=this.getGraphics();
		int x=e.getX(),y=e.getY();
		g.drawLine(last_x,last_y,x,y);
		//Her we are drawing straight line from last position to current position according to dragging of mouse.
		last_x=x;last_y=y;
	}
	@Override
	public void mousePressed(MouseEvent e){
		last_x=e.getX();last_y=e.getY();//x and y coordinate of mouse clicked position
	}//If mouse is Pressed then automatically an event will be generated of MouseEvent class by awt.
	@Override
	//Also we can define events for th below methods but we haven't defined any action under below events so no action will be taken for below events.
	public void mouseClicked(MouseEvent e) {
		showStatus("Mouse Clicked");//It will just print what has happened there.
	}
	@Override
	public void mouseReleased(MouseEvent e) {
	}
	@Override
	public void mouseEntered(MouseEvent e) {
	}
	@Override
	public void mouseExited(MouseEvent e) {
	}
	@Override
	public void mouseMoved(MouseEvent e) {
	}
}
/*
<applet code="Scribble1.class" height=500 width=400></applet>
 */ 