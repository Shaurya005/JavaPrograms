package OopProject;

import java.io.FileInputStream;//Helps to read data from file
import java.io.FileNotFoundException;
import java.io.FileOutputStream;//Helps to create file and also write to the file
import java.io.IOException;

public class Main_FileHandling {
	public static void main(String args[]) throws IOException //By this we can remove our try catch block
	{
   //FileOutputStream and FileInputStream are the classes involved in File Handling
   String data="I Love India";
   try {
   FileOutputStream fos=new FileOutputStream("myFile.txt");//Here Constructor is already defined within which we have to pass name of file
   //Data needs to be converted to byte array as we can't write this string data directly to the file
	byte[] byteData=data.getBytes(); //To convert our data into byte array
	//Now we can simply go ahead and write data to file
	fos.write(byteData);
	fos.close();}//It's our duty to close FileOutputStream. It will simply prevent any memory leakage in future.
	catch(IOException ex){
		System.out.println(ex);}
		//Now to read from the file
		//Here we are not using try catch block as already imported Exception package and used throws IO Exception
		FileInputStream fis= new FileInputStream("myFile.txt");
    //Convert data in the file into byte array i.e. extract byte array from the file
		int i;
		while((i=fis.read())!=-1){//As at the end of file there is -1 present
			System.out.println((char)i);//Type Casting into Char
		}
		fis.close();
   }
}