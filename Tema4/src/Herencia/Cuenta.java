package Herencia;

import EntradasSalidas.Tools;

public class Cuenta {
	//Atributos
	protected float saldo;
	protected float tasaAnual;
	protected byte numConsignacion=0;
	protected byte numRetiros=0;
	protected float comisionMensual=0;
	//Constructores
	public Cuenta() {}
	
	public Cuenta(float saldo, float tasaAnual) {
		this.saldo = saldo;
		this.tasaAnual = tasaAnual;
	}
	//setter and getter

	public float getSaldo() {
		return saldo;
	}

	public float getTasaAnual() {
		return tasaAnual;
	}

	public byte getNumConsignacion() {
		return numConsignacion;
	}

	public byte getNumRetiros() {
		return numRetiros;
	}

	public float getComisionMensual() {
		return comisionMensual;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public void setTasaAnual(float tasaAnual) {
		this.tasaAnual = tasaAnual;
	}
	
	//Metodos
	public void Consignar(float cantidad) {//Depositar dinero en cuenta
		saldo+=cantidad;
		numConsignacion++;
	}
	
	public void Retirar(float cantidad) {
		if (cantidad<=saldo) {
			saldo-=cantidad;
			numRetiros++;
		}
		else Tools.salidaError("Lo siento, la cantidad a retirar excede tu saldo");
	}
	
	public void CalcularInteresMensual() {
		float tasaMensual=tasaAnual/12;
		saldo+=saldo*tasaMensual;
	}
	
	public void ExtractoMensual() {
		saldo-=comisionMensual;
		CalcularInteresMensual();
	}

	public String Imprimir() {//Este es el toString
		return "Cuenta [saldo=" + saldo + ", tasaAnual=" + tasaAnual + ", numConsignacion=" + numConsignacion
				+ ", numRetiros=" + numRetiros + ", comisionMensual=" + comisionMensual + "]";
	}
	
}
