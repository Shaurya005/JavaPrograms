public class Main1 {
   public static void main(String[] args){
   	   //For Rectangle
	   Rectangle r1=new Rectangle();
	   //r1.length=12.8f;//Compilation error as length and breadth are made private
	   //r1.breadth=8.7f;
	   //So problem statement is how can we initialize length and breadth if instance variable are defined private
	   r1.setBreadth(8.7f);//By doing so value get assigned to our instance variable
	   r1.setLength(12.8f);//So we have implemented Setter, now how can we access length and breadth
	   System.out.println(r1.getBreadth());//It will simply return value of breadth
	   System.out.println(r1.getLength());
	   //So always remember it is never a recommended approach to use instance variable outside class directly
   }
}
