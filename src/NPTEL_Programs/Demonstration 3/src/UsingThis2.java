//The following program shows the use of this() to avoid the name-space collisions.

class Student{
int rollno;
String name,course;
float fee;
Student(int rollno,String name,String course){
this.rollno=rollno;
this.name=name;//this.name defines name member of class Student
this.course=course;
}
Student(int rollno,String name,String course,float fee){
this(rollno,name,course);//reusing constructor i.e. constructor defined above
this.course=course;
this.fee=fee;}
void display(){
System.out.println(rollno+" "+name+" "+course+" "+fee);}
}
class Demonstration_34{
	public static void main(String arg[]){
		Student s1=new Student(111,"Ankit","Java");
		Student s2=new Student(112,"Sumit","Java",6000);
		s1.display();
		s2.display();
}}