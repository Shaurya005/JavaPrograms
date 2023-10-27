package NPTEL_Programs.Demonstration_6.src;

//Dynamic Binding Concept: Code sharing through super concept
//Runtime polymorphism concept: During run time it'll resolve which method will be called here
class Cat{
	int i;
	void speak(){
		System.out.println("Meaon !");
	}}
class PetCat extends Cat{//PetCat is a type of Cat
	int i;//this i hides the i in A
	PetCat(int a,int b){
		super.i=a;//i in Cat
		i=b;//i in PetCat
	}
	void show(){
		System.out.println("i in superclass: "+super.i);
		System.out.println("i in subclass: "+i);
	}
	void speak(){//Overridding
		System.out.println("Meow !");
	}}
class MagicCat extends Cat{//Magic Cat is anther kind of Cat
	static boolean noOne;
	void speak(){
		if(noOne){
			super.speak();//Use the super class definition
		}
		else{
			System.out.println("Hello World !");
		}
	}
}
//It is multiple single inheritance

class SuperKeyword3{
	public static void main(String args[]){
		PetCat c1=new PetCat(1,2);
		c1.show();
		MagicCat c2=new MagicCat();
		c2.noOne=true;
		c2.speak();
		c1.speak();
		c2.noOne=false;
		c2.speak();
	}
}