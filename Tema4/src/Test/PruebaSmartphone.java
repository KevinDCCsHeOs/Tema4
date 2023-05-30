package Test;

import EntradasSalidas.Tools;
import TDA.*;

public class PruebaSmartphone {
	
	public static void main(String[] args) {
		Smartphone celPedro=new Smartphone("JPRO",3400,"SAMSUNG","microUSB");
		Chip telcel=new Chip("telcel", 45678978,"Micro");
		Chip unefon=new Chip("unefon", 4136896,"Micro");
		Chip rad=new Chip("unefon", 45678978,"Micro");
		
		celPedro.agregarChip(telcel);
		celPedro.agregarChip(unefon);
		celPedro.agregarChip(rad);
		Tools.imprimePantalla(""+celPedro.toString());
	}
	
}
