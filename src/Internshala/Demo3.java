package Internshala;

public class Demo3 {
public static void main(String[] a) { 
try{ int i= Integer.parseInt("5");} 
catch(Exception e){ System.out.println("Wrong format");} 
//catch(NumberFormatException e){
//System.out.println("Wrong Number format");}
finally {System.out.print("Its fine"); } 
}}