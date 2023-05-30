package Test;

import EntradasSalidas.Tools;
import Herencia.*;

public class TestCuenta {
	
	public static void main(String[] args) {
		MenuCuentas("Cuenta normal,Cuenta Ahorros,Cuenta Corriente,Imprimir,Salir");
	}
	
	public static void MenuCuentas(String menu) {
		String sel="", cn="",ca="",cc="";
		do {
			sel=Tools.Boton(menu);
			switch (sel) {
			case "Cuenta normal":
				Cuenta cue=new Cuenta(Tools.leerFloat("Saldo: "),Tools.leerFloat("Tasa anual"));
				cn+=cuenta(cue)+"\n";
				break;
			case "Cuenta Ahorros":
				CuentaAhorros cueAh=new CuentaAhorros(Tools.leerFloat("Saldo: "),Tools.leerFloat("Tasa anual"));
				ca+=cuentaAhorro(cueAh)+"\n";
				break;
			case "Cuenta Corriente":
				CuentaCorriente cueCor=new CuentaCorriente(Tools.leerFloat("Saldo: "),Tools.leerFloat("Tasa anual"));
				cc+=cuentaCorriente(cueCor)+"\n";
				break;
			case "Imprimir":
				Tools.imprimePantalla("Cuentas capturadas: \n\n Cuenta normales: \n"+cn+"\n Cuentas Ahorro: \n"+ca+"\n Cuentas Corrientes\n"+cc);
				break;
			case "Salir":
			}
		}while(!sel.equalsIgnoreCase("Salir"));
	}
	
	public static String cuenta(Cuenta cuenta) {
		String sel="";
		do {
			sel=Tools.Desplegable("Consignar,Retirar,Calcular Interes mensual,Extracto Mensual,Imprimir,Salir");
			switch(sel) {
			case "Consignar":
				cuenta.Consignar(Tools.leerFloat("Cantidad a depositar: "));
				Tools.imprimePantalla("Cantidad de saldo actual: "+cuenta.getSaldo());
				break;
			case "Retirar":
				cuenta.Retirar(Tools.leerFloat("Cantidad a retirar: "));
				break;
			case "Calcular Interes mensual: ":
				cuenta.CalcularInteresMensual();
				break;
			case "Extracto Mensual":
				cuenta.ExtractoMensual();
				break;
			case "Imprimir":
				Tools.imprimePantalla(cuenta.Imprimir());
				break;
			case "Salir":
				break;
			}
		}while(!sel.equalsIgnoreCase("Salir"));
		return cuenta.Imprimir();
	}
	
	public static String cuentaAhorro(CuentaAhorros cuenta) {
		String sel="";
		do {
			sel=Tools.Desplegable("Consignar,Retirar,Extracto Mensual,Imprimir,Salir");
			switch(sel) {
			case "Consignar":
				cuenta.Consignar(Tools.leerFloat("Cantidad a depositar: "));
				Tools.imprimePantalla("Cantidad de saldo actual: "+cuenta.getSaldo());
				break;
			case "Retirar":
				cuenta.Retirar(Tools.leerFloat("Cantidad a retirar: "));
				break;
			case "Extracto Mensual":
				cuenta.ExtractoMensual();
				break;
			case "Imprimir":
				Tools.imprimePantalla(cuenta.Imprimir());
				break;
			case "Salir":
				break;
			}
		}while(!sel.equalsIgnoreCase("Salir"));
		return cuenta.Imprimir();
	}
	
	public static String cuentaCorriente(CuentaCorriente cuenta) {
		String sel="";
		do {
			sel=Tools.Desplegable("Consignar,Retirar,Extracto Mensual,Imprimir,Salir");
			switch(sel) {
			case "Consignar":
				cuenta.Consignar(Tools.leerFloat("Cantidad a depositar: "));
				Tools.imprimePantalla("Cantidad de saldo actual: "+cuenta.getSaldo());
				break;
			case "Retirar":
				cuenta.Retirar(Tools.leerFloat("Cantidad a retirar: "));
				break;
			case "Extracto Mensual":
				cuenta.ExtractoMensual();
				break;
			case "Imprimir":
				Tools.imprimePantalla(cuenta.Imprimir());
				break;
			case "Salir":
				break;
			}
		}while(!sel.equalsIgnoreCase("Salir"));
		return cuenta.Imprimir();
	}
}
