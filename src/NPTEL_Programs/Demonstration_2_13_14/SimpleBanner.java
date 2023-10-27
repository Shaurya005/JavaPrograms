//package NPTEL_Programs.Demonstration_2_13_14;/*A simple banner applet.
//This applet creates a thread that scrolls the message
//contained in msg right to left across the applet's window.
//*/
////This illustrates five different methods init,start,paint,stop and destroy.
////Few more methods are there like update and repaint method which can be falicitated by banner applet.
//import java.awt.*;
//import java.applet.*;
//
//public class SimpleBanner extends Applet implements Runnable{
////This banner applet needs a thread to be executed so it implements Runnable interface so in thread we have to define run() method
//String msg="A Simple Moving Banner.";
//Thread t=null;
//int state;
//boolean stopFlag;
////Set colors and initialize thread.
//public void init(){
//setBackground(Color.cyan);
//setForeground(Color.red);
//}
////Start thread
//public void start(){
//t=new Thread(this);//Thread and its instance is created
//stopFlag=false;
//t.start();//Thread has started its execution.
////Whenever thread is executed, it executes the code inside run method.
//}
////Every point for the thread that runs the banner.
//public void run(){
//char ch;
////Display Banner
//for(;;){
//try{
//repaint();
//Thread.sleep(250);//Sleep state for 250 ms.
//ch=msg.charAt(0);
//msg=msg.substring(1,msg.length());
//msg+=ch;
//if(stopFlag)
//break;
//}
//catch(InterruptedException e){}
//}
//}
////pause the banner.
//public void stop(){
//stopFlag=true;
//t=null;
//}
////Display the banner.
//public void paint(Graphics gra){
//gra.drawString(msg,50,30);
//}
//}
////If codebase isn't mentioned then it is believed that class file and html file are present in same directory.
///*
//<html>
//<body>
//<applet codebase="." code="SimpleBanner.class"  width="500" height="100">
//</applet>
//</body>
//</html>
//*/