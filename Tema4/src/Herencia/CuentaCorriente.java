package Herencia;

public class CuentaCorriente extends Cuenta{
	//Atributos
	private float sobregiro=0;
	//Constructor
	public CuentaCorriente(float saldo, float tasaAnual) {
		super(saldo, tasaAnual);
	}
	//Metodos
	public void Retirar(float cantidad) {
		super.Retirar(cantidad);
		if (saldo<cantidad) {
			sobregiro+=cantidad-saldo;
			saldo=0;
		}
	}
	
	public void Consignar(float cantidad) {
		super.Consignar(cantidad);
		if (sobregiro>0)
			sobregiro-=cantidad;
	}
	
	public void ExtractoMensual() {
		if (numRetiros>4)
			comisionMensual+=(numRetiros-4)*200;
		super.ExtractoMensual();
	}
	
	public String Imprimir() {
		return super.Imprimir()+"CuentaCorriente [sobregiro=" + sobregiro + "]";
	}
	
	
	
}
