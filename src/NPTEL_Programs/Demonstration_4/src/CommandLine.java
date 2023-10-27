package NPTEL_Programs.Demonstration_4.src;

//Command line input in Java
class CommandLine{
public static void main(String args[]){
int i=0;
for(i=0;i<args.length;i++){
System.out.println(args[i]+" ");
}
System.out.println(args[i]+" ");//If we define int i in for loop then it won't be available outside it's bracket.
System.exit(0);
}}
