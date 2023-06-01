package Abstractas;

public class EmpleadoPorComision extends Empleado{
	
	private double ventasBrutas;
	private double tarifaComision;
	public EmpleadoPorComision(String nss, String nombre, String apellido, double ventas, double tarifa) {
		super(nss, nombre, apellido);
		setVentasBrutas(ventas);
		setTarifaComision(tarifa);
	}
	
	public double getVentasBrutas() {
		return ventasBrutas;
	}
	
	public double getTarifaComision() {
		return tarifaComision;
	}
	
	public void setVentasBrutas( double ventas ){
		ventasBrutas = ( ventas < 0.0 ) ? 0.0 : ventas;
	}
	
	public void setTarifaComision( double tarifa ){
		tarifaComision = ( tarifa > 0.0 && tarifa < 1.0 ) ? tarifa : 0.0;
	}
	
	public double ingresos(){
		return getTarifaComision() * getVentasBrutas();
	}
	
	public String toString(){
		return "Empleado por comision" + super.toString() + "Ventasbrutas: " + getVentasBrutas() + "Tarifa de comision: " + getTarifaComision();
	}
	
}
