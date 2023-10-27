//package NPTEL_Programs.Demonstration_2_13_14;
//
//import java.awt.*;
//
//public class MyCardLayout extends java.applet.Applet {
//	CardLayout layout;
//	public void init(){
//		layout=new CardLayout();
//		setLayout(layout);
//		add("1",new Button("Card1"));
//		add("2",new Button("Card2"));
//		add("3",new Button("Card3"));
//		add("4",new Button("Card4"));
//		add("5",new Button("Card5"));
//	}
//	public boolean keyDown(Event e,int key){
//		layout.next(this);
//		//If we click the mouse or press enter then next card will be popped.
//		//Instead of next we can also write previous.
//		return (true);
//	}
//}
///*
//<applet code="MyCardLayout.class" width=450 height=250>
//</applet>
//*/
