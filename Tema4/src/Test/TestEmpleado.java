package Test;

import Abstractas.*;
import EntradasSalidas.Tools;

public class TestEmpleado {

	public static void main(String[] args) {
		menu();
	}
	
	public static void menu() {
		String opc;int l=Tools.leerEntero("Numero de empleados a capturar: ");
		Empleado arrEmp[]=new Empleado[l];
		int j=0;
		do {
			opc=Tools.Desplegable("Empleados Registrados "+j,"Empleado Asalariado,Empleado por Comision,Empleado por Horas,Empleado Base mas Comision,Imprime.Array,Salir");
			switch(opc) {
			case "Empleado Asalariado":
				if ( j < l ) {
					Empleado em = new EmpleadoAsalariado(Tools.leerString("Numero De seguro social:"),Tools.leerString("Nombre:"),Tools.leerString("Apellidos:"),
							Tools.leerDouble("Salario:"));
					arrEmp[j] = em;
					j++;
				}
				else Tools.salidaError("No puedes ingresar mas datos");
				break;
			case "Empleado por Comision":
				if (j < l) {
					Empleado emCom=new EmpleadoPorComision(Tools.leerString("Numero De seguro social:"),Tools.leerString("Nombre:"),Tools.leerString("Apellidos:"),
							Tools.leerDouble("Ventas Brutas:"),Tools.leerDouble("Tarifa Comision:"));
					arrEmp[j]=emCom;
					j++;
				}
				else Tools.salidaError("No puedes ingresar mas datos");
				break;
			case "Empleado por Horas":
				if (j < l) {
					Empleado emHor=new EmpleadoPorHoras(Tools.leerString("Numero De seguro social:"),Tools.leerString("Nombre:"),Tools.leerString("Apellidos:"),
							Tools.leerDouble("Sueldo:"),Tools.leerDouble("Horas:"));
					arrEmp[j]=emHor;
					j++;
				}
				else Tools.salidaError("No puedes ingresar mas datos");
				break;
			case "Empleado Base mas Comision":
				if (j < l) {
					Empleado emCom=new EmpleadoBaseMasComision(Tools.leerString("Numero De seguro social:"),Tools.leerString("Nombre:"),Tools.leerString("Apellidos:"),
							Tools.leerDouble("Sueldo:"),Tools.leerDouble("Horas:"),Tools.leerDouble("Salario:"));
					arrEmp[j]=emCom;
					j++;
				}
				else Tools.salidaError("No puedes ingresar mas datos");
				break;
			case "Imprime.Array":
				String Acu="";
				for(int i=0;i<j;i++) {
					Acu+="\n"+arrEmp[i].toString();
				}
				Tools.imprimePantalla("Datos almacenados:\n"+Acu);
			case "Salir":
				break;
			}
		}while(!opc.equalsIgnoreCase("Salir"));
	}
}
