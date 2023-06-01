package Abstractas;

public class EmpleadoBaseMasComision extends EmpleadoPorHoras{
	
	private double salarioBase;

	public EmpleadoBaseMasComision(String nss, String nombre, String apellido, double sueldoPorHoras, double horasTrabajadas, double salario) {
		super(nss, nombre, apellido, sueldoPorHoras, horasTrabajadas);
		setSalarioBase(salario);
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase( double salario ){
		salarioBase = ( salario < 0.0 ) ? 0.0 : salario;
	}
	
	public double ingresos() {
		return getSalarioBase() + super.ingresos();
	}
	
	public String toString(){
		return "Empleado con salario base" + super.toString() + "Salario base: " + getSalarioBase();
	}
	
}
