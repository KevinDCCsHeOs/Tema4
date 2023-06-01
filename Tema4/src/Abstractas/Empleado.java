package Abstractas;

public abstract class Empleado {
	
	private String primerNombre;
	private String apellidoPaterno;
	private String numeroSeguroSocial;
	
	public Empleado(String nss, String nombre, String apellido) {
		numeroSeguroSocial=nss;
		primerNombre=nombre;
		apellidoPaterno=apellido;
	}

	public String getPrimerNombre() {
		return primerNombre;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public String getNumeroSeguroSocial() {
		return numeroSeguroSocial;
	}

	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public void setNumeroSeguroSocial(String numeroSeguroSocial) {
		this.numeroSeguroSocial = numeroSeguroSocial;
	}

	@Override
	public String toString() {
		return "Empleado [primerNombre=" + primerNombre + ", apellidoPaterno=" + apellidoPaterno
				+ ", numeroSeguroSocial=" + numeroSeguroSocial + "]";
	}
	
	public abstract double ingresos();
	
}
