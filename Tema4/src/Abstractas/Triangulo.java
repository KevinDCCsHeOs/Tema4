package Abstractas;

public class Triangulo extends Figura{
	
	private float base,altura;

	public Triangulo() {
		super();
	}

	public Triangulo(String col,float base, float altura) {
		super("Triangulo", col);
		this.base=base;
		this.altura=altura;
	}

	public float getBase() {
		return base;
	}

	public float getAltura() {
		return altura;
	}

	public void setBase(float base) {
		this.base = base;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	public double area() {
		return (this.base*this.altura)/2;
	}

	@Override
	public String toString() {
		return super.toString()+"Triangulo [base=" + base + ", altura=" + altura + "]";
	}
	
}
