/*An interface can help to support the shared variable to use across the manypacks’ many packages or many classes in different packages.
  So, here is an example as you see the interface includes declarations of some variable.
  This interface includes some static variable which is declared here; NO, YES, MAYBE thisone.Now, so once this interface is declared and then stored in the package,
  then any other class can use them as a global variable look like so; that means, it is called as sharedvariable in that sense.

class Demonstration_98 implements SharedConstants{
static void answer(int result){
switch(result){
case NO:
  System.out.println("No");
  break;
case YES:
  System.out.println("Yes");
  break;
case MAYBE:
  System.out.println("Maybe");
  break;
case LATER:
  System.out.println("Later");
  break;
case SOON:
  System.out.println("Soon");
  break;
case NEVER:
  System.out.println("Never");
  break;  
  }
  }
  public static void main(String a[]){
  Question q=new Question();
  answer(q.ask());//Used to generate random numbers
    answer(q.ask());
	  answer(q.ask());
	    answer(q.ask());
}}
*/