package Test;

import Abstractas.*;
import EntradasSalidas.Tools;

public class TestFigura {
	
	public static void main(String[]args) {
		menu();
	}
	
	public static void menu() {
		String opc;
		Figura arrFig[]=new Figura[10];
		int j=0;
		do {
			opc=Tools.Desplegable("Figuras Registradas"+j,"Triangulo,Cuadrado,Imprime.Array,Salir");
			switch(opc) {
			case "Triangulo":
				if(j<10) {
					Figura Trian=new Triangulo(Tools.leerString("Color"),Tools.leerFloat("Base"),Tools.leerFloat("Altura"));
					arrFig[j]=Trian;
					j++;
				}
				else {Tools.salidaError("No puedes ingresar mas datos");}
				break;
			case "Cuadrado":
				if(j<10) {
					Figura Rectan=new Cuadrado(Tools.leerString("Color"),Tools.leerFloat("Lado"));
					arrFig[j]=Rectan;
					j++;
				}
				else {Tools.salidaError("No puedes ingresar mas datos");}
				break;
			case "Imprime.Array":
				String Acu="";
				for(int i=0;i<j;i++) {
					Acu+="\n"+arrFig[i].toString();
				}
				Tools.imprimePantalla("Datos almacenados:\n"+Acu);
			case "Salir":
				break;
			}
		}while(!opc.equalsIgnoreCase("Salir"));
	}
}
