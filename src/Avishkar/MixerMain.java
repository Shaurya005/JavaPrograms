package Avishkar;

public class MixerMain
{
	MixerMain(){}
	MixerMain(MixerMain m){m1=m;}
	MixerMain m1;
	void go(){System.out.println("Hi");}
	public static void main(String args[]){
		MixerMain m2=new MixerMain();
		MixerMain m3=new MixerMain(m2);
		MixerMain m4=m3.m1;
		MixerMain m5=m2.m1;
		m3.go();m4.go();
	}
}