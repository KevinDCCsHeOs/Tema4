package Abstractas;

public class EmpleadoAsalariado extends Empleado{
	
	private double salarioSemanal;

	public EmpleadoAsalariado(String nss, String nombre, String apellido, double salario) {
		super(nss, nombre, apellido);
		setSalarioSemanal(salario);
		// TODO Auto-generated constructor stub
	}

	public double getSalarioSemanal() {
		return salarioSemanal;
	}

	public void setSalarioSemanal(double salario) {
		salarioSemanal = (salario < 0.0)?0.0:salario;
	}
	
	public double ingresos() {
		return getSalarioSemanal();
	}

	@Override
	public String toString() {
		return "Empleado Asalariado" + super.toString() +" salarioSemanal=" + getSalarioSemanal();
	}
	
	
	
}
