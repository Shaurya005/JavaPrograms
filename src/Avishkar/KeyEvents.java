package Avishkar;

import java.awt.event.*;
import java.awt.*;
import java.applet.*;
//Whenever there occur key event, key events can be categorised into keyTyped, keyPressed and keyReleased
public class KeyEvents extends Applet implements KeyListener {
	String msg="";int x=10,y=20;//output coordinates
	public void init(){
		addKeyListener(this);//It will watch if any event occur at any instant
		requestFocus();//request input focus so awt install the run time manager to request focus for the keyboard.
	}
	@Override
	public void keyTyped(KeyEvent e) {
		msg+=e.getKeyChar();repaint();
	}
	@Override
	public void keyPressed(KeyEvent e) {
		showStatus("Key Up");//display status at status bar of applet
	}
	@Override
	public void keyReleased(KeyEvent e) {
		showStatus("Key down");
	}
	public void paint(Graphics g){
		g.drawString(msg,x,y);
	}
}
/*
<applet code="KeyEvents.class" height=300 width=400>
</applet>
 */