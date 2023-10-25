package Avishkar;

//Illustration of different states of a thread for example, yield(), stop() and sleep() methods.
class ClassA extends Thread{
	public void run(){
		System.out.println("Start Thread A.....");
		for(int i=1;i<=5;i++){
			if(i==1)
				yield();
			System.out.println("From Thread A: i = "+i);
		}
		System.out.println("....Exit Thread A");
	}}

class ClassB extends Thread{
	public void run(){
		System.out.println("Start Thread B.....");
		for(int j=1;j<=5;j++){
			System.out.println("From Thread B: j = "+j);
			if(j==2)
				stop();//This thread will no more executed after it.
		}
		System.out.println("....Exit Thread B");
	}}

class ClassC extends Thread{
	public void run(){
		System.out.println("Start Thread C.....");
		for(int k=1;k<=5;k++){
			System.out.println("From Thread C: k ="+k);
			if(k==3){
				try{
					sleep(1000);//1000 millisecond
				}
				catch(Exception e){}
			}}
		System.out.println("....Exit Thread C");
	}}
/*
So, parallel execution means that they will share the system may be in a time sharing basis or in a multi programming basis that is the part of the operating system. So, operating system; that means, here Java run time manager will manage the execution of all the threads in parallel.
So, this way actually if we run says sorting and searching one by one. So, this may takes a 5 plus 5 10 seconds.
But, if you run in parallel it may take 5 seconds both the program will run, but it will the maximally utilize the CPU resources other resources, those are required in your program execution can be maximally utilized. So, this is the purpose of the threads execution.


So, what essentially the multithreading basically it is there. So, as we see each thread has its own code. Now again for example, say suppose we want to run 2 methods, one method will be for sorting some array of elements and another method for searching some elements in a array.
So, what we can do is that, we can create a thread for the sorting method implementation we can create another thread for implementation of searching method.
So, whatever the logic there is to sort some array or elements we can write the code under the run similarly, whatever the code that is required to search an item in an array we can put into the run method.
*/
class ThreadStages{
	public static void main(String args[]){
		ClassA a=new ClassA();
		ClassB b=new ClassB();
		ClassC c=new ClassC();
		a.start();//Starting execution
		b.start();
		c.start();
		System.out.println("....End of Execution ");
	}
}
//Actually here 4 threads will run concurrently including main method.