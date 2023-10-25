package Avishkar;

//Multiple Errors by a single catch block...
class Exception_3{
	public static int j;
	public static void main(String args[]){
		for(int i=0;i<4;i++){
			try{
				switch(i){
					case 0:
						int zero=0;
						j=999/zero;//Divide by zero exception
						break;
					case 1:
						int b[]=null;
						j=b[0];//Null Pointer error
						break;
					case 2:
						int c[]=new int[2];
						j=c[10];//Array index is out of bound
						break;
					case 3:
						char ch="Java".charAt(9);//String index out of bound
						break;
				}
			}
			catch(Exception e){
				System.out.println("\n"+"In Test case #"+i);
				System.out.println(e);
				System.out.println(e.getMessage());
			}
		}
	}
}