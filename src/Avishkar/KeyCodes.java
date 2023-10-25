package Avishkar;

import java.awt.event.*;
import java.awt.*;
import java.applet.*;
//<applet code="KeyCodes.class" height=300 width=400> </applet>
//There are three different types of keys that is possible like if we press function key,control,alt key, there will be no character displayed. Other ones are alphabets and digits.
public class KeyCodes extends Applet implements KeyListener {
	String msg = "";
	int x = 10, y = 20;//output coordinates

	public void init() {
		addKeyListener(this);
		requestFocus();//request input focus
	}

	@Override
	public void keyTyped(KeyEvent e) {
		msg += e.getKeyChar();//If we type other characters then it will get that.
		repaint();
	}

	@Override
	public void keyPressed(KeyEvent e) {
		showStatus("Key Down");
		int key = e.getKeyCode();
		switch (key) {
			case KeyEvent.VK_F1://If F1 key is pressed on keyboard
				msg += "<F1>";
				break;
			case KeyEvent.VK_F2:
				msg += "<F2>";
				break;
			case KeyEvent.VK_F3:
				msg += "<F3>";
				break;
			case KeyEvent.VK_PAGE_DOWN:
				msg += "<PgDn>";
				break;
			case KeyEvent.VK_PAGE_UP:
				msg += "<PgUp>";
				break;
			case KeyEvent.VK_LEFT:
				msg += "<Left Arrow>";
				break;
			case KeyEvent.VK_RIGHT:
				msg += "<Right Arrow>";
				break;
		}
		repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		showStatus("Key Up");
	}

	public void paint(Graphics g) {
		g.drawString(msg, x, y);//Displaying message string
	}
}