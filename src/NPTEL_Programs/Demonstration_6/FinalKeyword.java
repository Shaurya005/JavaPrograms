package NPTEL_Programs.Demonstration_6;

//Final Keyword is a strict keyword if we declare a class final means this class can't be inherited from any class i.e no subclass can be created.
//A class, method and variable can be made as final. 
//If we declare a method as final then it can't be overridden in any way however it can be referred in subclass.
final class Bike{}
//Used to protect data in class
//class Honda extends Bike{ // Show Compilation Error
   class Honda{
	void run(){
		System.out.println("Running safely");
	}}

final class FinalKeyword{
	public static void main(String args[]){
		Honda honda_=new Honda();
		honda_.run();
	}}