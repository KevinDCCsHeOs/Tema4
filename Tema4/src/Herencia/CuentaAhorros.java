package Herencia;

public class CuentaAhorros extends Cuenta{
	//Atributos
	private boolean activa;
	//Constructor
	public CuentaAhorros(float saldo, float tasaAnual) {
		super(saldo, tasaAnual);
		activa=(saldo<10000)?false:true;
	}
	//Metodos sobre escritos
	public void Consignar(float cantidad) {
		if(activa)
			super.Consignar(cantidad);
	}
	
	public void Retirar(float cantidad) {
		if (activa)
			super.Retirar(cantidad);
		if (saldo<10000)
			activa=false;
	}
	
	public void ExtractoMensual() {
		if (numRetiros>4)
			comisionMensual+=(numRetiros-4)*200;
		super.ExtractoMensual();
		if (saldo<10000) activa=false;
	}
	
	public String Imprimir() {
		return super.Imprimir()+"CuentaAhorros [activa=" + activa + "]";
	}
	
	
	
}
