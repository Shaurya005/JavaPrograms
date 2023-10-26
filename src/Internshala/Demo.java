package Internshala;

abstract class A1{
A1() { System.out.print("Z");}}
class A2 extends A1{ 
A2() {System.out.print("Y");}} 
class A3 extends A2{ 
A3() {System.out.print("X");}} 
public class Demo { 
public static void main (String [] a) {
new A3(); }}