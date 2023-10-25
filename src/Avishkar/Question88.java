package Avishkar;

import java.io.*;
class Question88 extends Thread{
	public void run (){
		System.out.println("HI...");
	}
	public static void main(String args[]) {
		Question88 t = new Question88();
		t.run();
		//t.start();
		try{
			InputStream file=new FileInputStream("./Text.txt");
			System.out.print(file.available());
		}
		catch(Exception e){
			System.out.print(e);
		}
	}
}