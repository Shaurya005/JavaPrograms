import java.applet.*;
import java.awt.*;

public class AppletSizeAndStatusWindow extends Applet{

public void init(){
	setBackground(Color.cyan);
}
public void paint(Graphics g){
Dimension appletSize=this.getSize();
int appletHeight=appletSize.height;
int appletWidth=appletSize.width;

g.drawString("This applet is shown in applet window and is "+appletHeight+" X "+appletWidth);
showStatus("This is shown in the status window.");
}
}