package Internshala;
//Main.java file is present in this package com.internshala.javaapp
//Main file is actually a java file
//Main.java[Java Code] after being passed to compiler get converted into Main.class[Byte Code]
//Here in Main.class code is in language of binary code i.e. in bytes
public class Main {
    //Whatever code we write, is written inside class
    public static void main(String[] args)//main is method/function here
    {
        System.out.println("Hello Internshala");
        System.out.println("    Hello Internshala Again");
        System.out.println("90-20"  );
        System.out.println(90 - 20);
        System.out.println(900 / 20);
        String name="India";
        int population=32264000;
        float populationDensity=393.9f;//Or 393.0F
        double GDP = 2.454;//Or 2.454d or D
        char currency='R';
        char curr='\u2089';// \ followed by u and then by hex digit, it is a single character
        boolean isSecular=true;
        System.out.println(name+" has population density of "+populationDensity+" and has population of "+population+" per square km"  );
        //Compile time(Handled by JDK) and Run Time(Handled by JRE that contains JVM)
    }
}
