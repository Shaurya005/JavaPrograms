package Internshala;

public class Main5 {

	public static void main(String args[]){
		int[] FirstArray={20,19,45,7};
		System.out.println(FirstArray[2]);
		FirstArray[1]=60;
		System.out.println(FirstArray[1]);
		System.out.println(FirstArray.length);
		/*float[] SecondArray;
		SecondArray = {43.6f, 87.0f, 45f};Array initializer is not allowed as it is*/
		float[] SecondArray=new float[3];
		//SecondArray = {43.6f, 87.0f, 45f};It is wrong here also
		SecondArray[0]=5;
		SecondArray[1]=7.8f;
		SecondArray[2]=87.98f;
		/*float[] SecondArray;
		SecondArray = new float[]{43.6f, 87.0f, 45f};It can be done like this too*/
	    for(int i=0;i<SecondArray.length;i++){
		    System.out.println(SecondArray[i]);
	    }
	    float sum=0;
		for (float num:SecondArray) {
			System.out.println(num);//For each loop(advanced form of for loop)
			sum+=num;
			//Here in for each loop we don't have to use counter variable
		}
		System.out.println("Sum of array is: "+sum);
	//2D Array is collection of same data type in 2 Dimensional Array or Collection of 1D array
	int first[] ={23,45,6,78};//C-style declaration of array
	int[] second={43,78,12,0};//Java style array declaration of field second
	int[] third={32,90,54,9};
	//int First2DArray[][]={first,second,third};It is also right
	int[][] First2DArray={first,second,third};
	int[][] Second2DArray={{23,45,6,78},{43,78,12,0},{32,90,54,9}};
    for(int row=0;row<Second2DArray.length;row++){
    	for(int column=0;column<Second2DArray[row].length;column++)
	    System.out.print(Second2DArray[row][column]+" ");
	    System.out.println();
    }
	}
}

