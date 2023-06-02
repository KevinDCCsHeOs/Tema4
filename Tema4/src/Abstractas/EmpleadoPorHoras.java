package Abstractas;

public class EmpleadoPorHoras extends Empleado{
	
	private double sueldo;
	private double horas;
	
	public EmpleadoPorHoras(String nss, String nombre, String apellido, double sueldoPorHoras, double horasTrabajadas ) {
		super(nss, nombre, apellido);
		setSueldo(sueldoPorHoras);
		setHoras(horasTrabajadas);
	}

	public double getSueldo() {
		return sueldo;
	}

	public double getHoras() {
		return horas;
	}

	public void setSueldo( double sueldoPorHoras ){
		sueldo = ( sueldoPorHoras < 0.0 ) ? 0.0 : sueldoPorHoras;
	}

	public void setHoras( double horasTrabajadas ){
		horas = ( ( horasTrabajadas >= 0.0 ) && ( horasTrabajadas <= 168.0 ) ) ? horasTrabajadas : 0.0;
	}
	
	public double ingresos(){
		if ( getHoras() <= 40 )
			return getSueldo() * getHoras();
		else
			return 40 * getSueldo() + ( getHoras() - 40 ) * getSueldo() * 1.5;
	}
	
	public String toString(){
		return "Empleado por horas" + super.toString() + "Sueldo por hora:" + getSueldo() + " Horas trabajadas: " + getHoras();
		}
	
}
