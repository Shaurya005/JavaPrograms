package internshala;
public class Main2 {
    public static void main(String args[])
    {
    	//Implicit Conversion
	    int radius=400;
	    double newRadius=radius;
	    long newRad=radius;
	    System.out.println(newRadius+" "+newRad);

	    //Explicit Conversion(Some values get lost in explicit conversion)
	    double diameter=3.78;
	    int newDiameter=(int)diameter;
	    long dia=635487598686L;
	    int newDia=(int)dia;
	    System.out.println(newDiameter);
	    System.out.println(newDia);
    }
}
