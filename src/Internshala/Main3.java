package Internshala;

import java.util.Scanner;
//Here package is java.util(predefined packages) and it contains class Scanner
public class Main3 {
	public static void main(String args[]){
		String name;int population;float populationDensity;
		double gdp;char currency;boolean isSecular;
		Scanner scanner=new Scanner(System.in);//scanner is reference variable here
		//System.out.println("Enter Your country name ");
		//name=scanner.next();//Returns first token or string until it reaches space
		//System.out.println(name);
		System.out.println("Enter Your country name ");
		String Name=scanner.nextLine();
		population=scanner.nextInt();
		//gdp=scanner.nextDouble();
		//populationDensity=scanner.nextFloat();
		//isSecular=scanner.nextBoolean()
		System.out.println("Your country name is "+Name);
		System.out.println("Your country population is "+population);
		System.out.println("Enter your country currency ");
		currency=scanner.next().charAt(0);
		System.out.println("Your country currency is "+currency);
		scanner.close();//It ensures that our program is robust and  avoid any memory leakage in future
	}
}
