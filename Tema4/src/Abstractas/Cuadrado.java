package Abstractas;

public class Cuadrado extends Figura{
	
	private float lado;

	public Cuadrado() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cuadrado( String col,float lado) {
		super("Cuadrado", col);
		this.lado=lado;
	}

	public float getLado() {
		return lado;
	}

	public void setLado(float lado) {
		this.lado = lado;
	}
	
	public double area() {
		return Math.pow(lado, 2);
	}

	@Override
	public String toString() {
		return super.toString()+"Cuadrado [lado=" + lado + "]";
	}
	
}
