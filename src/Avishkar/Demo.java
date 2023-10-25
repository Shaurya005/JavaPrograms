package Avishkar;

class BOARD{
	double d;
	void Display(){
		System.out.println(d);
	}
}
class Demo{
	public static void main(String args[])
	{
		BOARD B[]=new BOARD[5];
		B[0]=new BOARD();
		B[1]=new BOARD();
		B[2]=new BOARD();
		B[3]=new BOARD();
		B[4]=new BOARD();B[0].d=5.5;B[1].d=34.5;B[2].d=65.5;B[3].d=3.5;B[4].d=35.5;
		for (int i=0;i<5;i++){
//System.out.println(B[i].Display());//Error void type is not allowed here
			B[i].Display();
		}
	}
}